package FuramaResort.service;

import java.util.List;

public interface IFuramaService<E> {
    void add(E e);
    List<E> getList();
}
