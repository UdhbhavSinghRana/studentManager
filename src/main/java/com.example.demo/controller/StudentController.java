@RestController


public Class StudentController {

    Map<String, Student> mapIdToStudent;
    
    Map<String, Student> mapUniToStudent;

    @PostMapping("/addStudent")
    public String addStudent(@RequestBody String name,
                            @RequestBody int age,
                            @RequestBody String adhar,
                            @RequestBody String Uni) {
        String id = UUID.randomUUID().toString();
        Student student = new Student(id, name, age, adhar, Uni);
        mapIdToStudent.put(id, student);

        List<Student> students = mapUniToStudent.getOrDefault(Uni, new ArrayList());
        mapUniToStudent.put(Uni, students);
        return id;
    }

    @GetMapping("/getStudentsByUni")
    public List<Student> getStudentsByUni(String uni) {
        return mapUniToStudent.getOrDefault(uni, null);
    }

    @GetMapping("/getStudentById")
    public Student getStudentById(String id) {
        return mapIdToStudent.getOrDefault(id, null);
    }
}
