package FuramaResort.repository;

import java.util.List;

public interface IFuramaRepository<E> {
    void add(E e);
    List<E> getList();
}
