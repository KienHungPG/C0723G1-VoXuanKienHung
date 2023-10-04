package casestudy.repository;

import java.util.List;

public interface IPersonRepository<O> {
    List<O> displayList();
    void add(O o);
    void edit(O o);
    void delete(String id);
    List<O> search(String name);
}
