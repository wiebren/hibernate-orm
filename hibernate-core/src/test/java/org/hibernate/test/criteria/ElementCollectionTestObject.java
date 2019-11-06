package org.hibernate.test.criteria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author wiebren
 */
@Entity
public class ElementCollectionTestObject {
    @Id
    @GeneratedValue
    private Integer id;

    @ElementCollection
    private List<String> values = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public List<String> getValues() {
        return values;
    }

    public void setValues(final String... values) {
        this.values = Arrays.asList(values);
    }
}
