// 2. Backend - Spring Boot (backend/src/main/java/com/exemplo/reembolso/controller/ReembolsoController.java)

@RestController
@RequestMapping("/reembolsos")
public class ReembolsoController {

    @Autowired
    private RuntimeService runtimeService;

    @PostMapping
    public ResponseEntity<String> iniciarProcesso(@RequestBody Map<String, Object> dados) {
        ProcessInstance instance = runtimeService.startProcessInstanceByKey("Processo_Reembolso", dados);
        return ResponseEntity.ok(instance.getId());
    }

    @GetMapping("/status/{id}")
    public ResponseEntity<String> consultarStatus(@PathVariable String id) {
        Execution execution = runtimeService.createExecutionQuery().processInstanceId(id).singleResult();
        if (execution == null) {
            return ResponseEntity.ok("Processo finalizado ou inexistente.");
        }
        return ResponseEntity.ok("Ativo na atividade: " + execution.getActivityId());
    }
}
