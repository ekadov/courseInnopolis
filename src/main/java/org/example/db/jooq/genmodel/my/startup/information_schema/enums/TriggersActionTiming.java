/*
 * This file is generated by jOOQ.
 */
package my.startup.information_schema.enums;


import javax.annotation.processing.Generated;

import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum TriggersActionTiming implements EnumType {

    BEFORE("BEFORE"),

    AFTER("AFTER");

    private final String literal;

    private TriggersActionTiming(String literal) {
        this.literal = literal;
    }

    @Override
    public Catalog getCatalog() {
        return null;
    }

    @Override
    public Schema getSchema() {
        return null;
    }

    @Override
    public String getName() {
        return "TRIGGERS_ACTION_TIMING";
    }

    @Override
    public String getLiteral() {
        return literal;
    }
}
