package designPatternCode.FilterPattern.Demo1;

import java.util.List;

public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
