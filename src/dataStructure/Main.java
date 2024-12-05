package dataStructure;

public class Main {
    public static void main(String[] args) {
        DataStructure ds = new DataStructure();
        ds.addAge(1);
        ds.addAge(3);
        ds.addAge(2);
        ds.addHometown("Naperville");
        ds.addHometown("Naver");
        ds.addHometown("Awesometown");
        ds.addHometownQueue("Naperville");
        ds.addHometownQueue("Naver");
        ds.addHometownQueue("Awesometown");
        ds.addMajorGpa("James", 4.0);
        ds.addMajorGpa("John", 3.0);
        ds.addMajorGpa("Jane", 2.0);
        ds.addStudent("James");
        ds.addStudent("John");
        ds.addStudent("Jane");
        ds.addNationality("British");
        ds.addNationality("Indian");
        ds.addNationality("American");
        ds.printAge();
        ds.printHometowns();
        ds.printMajorGpa();
        ds.printStudents();
        ds.printHometownQueue();
        ds.printNationality();
        ds.removeAge();
        ds.removeHometownQueue();
        ds.removeHometown("Naver");
        ds.removeStudent("James");
        ds.removeNationality("Indian");
        ds.removeMajorGpa("James");
        ds.printAge();
        ds.printHometowns();
        ds.printMajorGpa();
        ds.printStudents();
        ds.printHometownQueue();
        ds.printNationality();


    }
}
