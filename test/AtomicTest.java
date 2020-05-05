import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 描述：原子类型学习
 *
 * @author Dennis
 * @version 1.0
 * @date 2020/3/31 12:11
 */

public class AtomicTest {
    public static void main(String[] args) {
        AtomicInteger atoInt1 = new AtomicInteger();
        System.out.println(atoInt1.get());

        ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 3, 5L, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(5));


        atoInt1.getAndSet(10);

        System.out.println(atoInt1.get());

        System.out.println(atoInt1.get());

        AtomicInteger atoInt2 = new AtomicInteger();
        System.out.println(atoInt2.get());
        atoInt2.addAndGet(1);
        System.out.println(atoInt2.get());



    }

}
