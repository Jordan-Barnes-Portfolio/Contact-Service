import org.junit.jupiter.api.Test;

public class TaskTest {

    @Test
    public void createValidTaskData() {
        Task task = new Task("0000000001", "Reading", "The Wheel of Time");
        System.out.println(task);
    }

}