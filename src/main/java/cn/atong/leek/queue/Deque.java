package cn.atong.leek.queue;

/**
 * @program data-structures-and-algorithms
 * @description 双端队列接口
 * @author atong
 * @create 2023-12-04 17:06
 */
public interface Deque<E> extends Queue<E> {

    void addFirst(E e);

    void addLast(E e);
}
