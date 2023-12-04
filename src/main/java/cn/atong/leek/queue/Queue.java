package cn.atong.leek.queue;

/**
 * @program data-structures-and-algorithms
 * @description 单端队列接口
 * @author atong
 * @create 2023-12-04 16:24
 */
public interface Queue<E> {

    boolean add(E e);

    boolean offer(E e);

    E poll();

    E peek();
}
