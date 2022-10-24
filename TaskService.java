import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskService {

    public static List<Task> tasks = new ArrayList<>();

    public static void main(String[] args) {

        //create an instance of TaskService
        TaskService service = new TaskService();

        //use the instance variable service and invoke addTask(Task) method that accept an instance of Task object
        //pass the 3 string parameters of unique id, name and description to the Task public constructor
        //add 3 VALID Task record
        service.addTask(new Task("0000000001", "Running", "Run down the road"));
        service.addTask(new Task("0000000002", "Playing", "Fortnite"));
        service.addTask(new Task("0000000003", "Walking", "Walk the puppy"));

        //display all added and updated Task object
        for (Task obj : tasks) {
            System.out.println(obj);
        }

        //create an existing task ID
        service.addTask(new Task("0000000001", "Listening", "Classical Music"));

        System.out.println("Delete Task ID #0000000002");
        service.deleteTask("0000000002");
        System.out.println("Update Task ID #0000000003");
        service.update(new Task("0000000003", "Running", "Jogging with friends"));

        //display all added and updated Task object
        for (Task obj : tasks) {
            System.out.println(obj);
        }
    }

    /**
     *
     * @param task - Task class containing id, name & description variables
     *
     * add Task object if List is empty and passed all the field validations
     *
     */
    public boolean addTask(Task task) {
        //Use binary search algorithmn to check if task exists
        int index = getIndex(task);

        //validate id with verbose tenary statement
        if (index < 0 && validateID(task.getId()) && validateName(task.getName()) && validateDescription(task.getDescription())) {
            tasks.add(task);
            return true;
        }

        return false;
    }

    /**
     *
     * @param id
     *
     * delete Task object when Task ID exist
     *
     */
    public void deleteTask(String id) {
        //invoke getIndex(Task) method
        int index = getIndex(new Task(id, "", ""));

        //check if index is greater than or equal to 0 to prevent OOB exception
        if (index >= 0)
            tasks.remove(index);
    }

    /**
     *
     * @param task
     *
     * update Task object if same ID and valid name and description
     */
    public void update(Task task) {
        for (Task obj : tasks) {
            if (obj.equals(task) && validateName(task.getName()) && validateDescription(task.getDescription())) {
                obj.setName(task.getName());
                obj.setDescription(task.getDescription());
            }
        }
    }

    /**
     *
     * @param task
     * @return integer data type
     *
     * use Collections binary search by Task ID
     * return positive integer from 0 to N if ID is found
     * return negative integer if ID is not found
     */
    public int getIndex(Task task) {
        int index = Collections.binarySearch(tasks, task, Task.compareById);
        return index;
    }

    /**
     *
     * @param id
     * @return true or false
     *
     * validate id parameter, if not null and length is less than or equal to 10
     */
    public boolean validateID(String id) {
        if (id != null && id.length() <= 10)
            return true;

        return false;
    }

    /**
     *
     * @param name
     * @return true or false
     *
     * validate name parameter, if not null and length is less than or equal to 20
     */
    public boolean validateName(String name) {
        if (name != null && name.length() <= 20)
            return true;

        return false;
    }

    /**
     *
     * @param description
     * @return true or false
     *
     * validate description parameter, if not null and length is less than or equal to 50
     */
    public boolean validateDescription(String description) {
        if (description != null && description.length() <= 50)
            return true;

        return false;
    }
}