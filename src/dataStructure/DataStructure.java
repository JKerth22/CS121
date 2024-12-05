package dataStructure;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DataStructure {
    private int count = 0;
    private ArrayList<String> studentList = new ArrayList<>();
    private int[] ageList = new int[3];
    private HashMap<String, Double> majorGpaMap = new HashMap<>();
    private LinkedList<String> nationalityList = new LinkedList<>();
    private Stack<String> hometownStack = new Stack<>();
    private Queue<String> hometownQueue = new LinkedList<>();

    public void addStudent(String name){
        studentList.add(name);
    }
    public void addAge(int age) {
                ageList[count] = age;
                count++;
    }
    public void addMajorGpa(String name, double gpa) {
        majorGpaMap.put(name, gpa);
    }
    public void addNationality(String nationality) {
        nationalityList.add(nationality);
    }
    public void addHometown(String hometown) {
        hometownStack.push(hometown);
    }
    public void addHometownQueue(String hometown) {
        hometownQueue.add(hometown);
    }
    public void removeStudent(String name){
        studentList.remove(name);
    }
    public void removeHometown(String name){
        hometownQueue.remove(name);
    }
    public void removeHometownQueue(){
        hometownQueue.remove();
    }
    public void removeAge(){
        ageList[count-1] = 0;
        count--;
    }
    public void removeMajorGpa(String name){
        majorGpaMap.remove(name);
    }
    public void removeNationality(String nationality){
        nationalityList.remove(nationality);
    }
    public void printStudents(){
        for (String name : studentList){
            System.out.println(name);
        }
    }
    public void printHometowns(){
        for (String name : hometownStack){
            System.out.println(name);
        }
    }
    public void printHometownQueue(){
        for (String name : hometownQueue){
            System.out.println(name);
        }
    }
    public void printAge(){
        for (int i=0; i<ageList.length; i++) {
            System.out.println("Age: " + ageList[i]);
        }
    }
    public void printMajorGpa(){
        for (String name : this.majorGpaMap.keySet()) {
            System.out.println(name + " : " + majorGpaMap.get(name));
        }
    }
    public void printNationality(){
        for (String name : this.nationalityList) {
            System.out.println(name);
        }
    }


}
