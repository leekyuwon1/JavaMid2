package collection.deque.test.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class TaskScheduler {

    Deque<Task> tasks = new ArrayDeque<>();

    public void addTask(Task task) {
        tasks.offer(task);
    }

    public int getRemainingTasks() {
        return tasks.size();
    }

    public void processNextTask() {
        Task task = tasks.poll();
        if (task != null) {
            task.execute();
        }
//        Task element = tasks.element(); // 제약이 없음. 다른 곳에서도 사용할 수 있는 상황
//        element.execute();
//        tasks.poll();
    }
}
