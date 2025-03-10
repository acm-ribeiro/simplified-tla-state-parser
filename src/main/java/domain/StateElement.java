package domain;

import java.util.Map;

public class StateElement {

    private final EnsuresState ensures;
    private final Map<String, Entity> entities;
    private final SchemaMapping schemaMapping;

    public StateElement(EnsuresState ensuresState, Map<String, Entity> entities,
        SchemaMapping schemaMapping) {
        ensures = ensuresState;
        this.entities = entities;
        this.schemaMapping = schemaMapping;
    }

    /**
     * Checks whether this state element is an entity.
     *
     * @return true if the element is an entity; false otherwise.
     */
    public boolean isEntity() {
        return entities != null && !entities.isEmpty();
    }

    /**
     * Returns the number of records within the given entity.
     * E.g. p = (p1 :> [...], p2 :> [...]) will return 2.
     *
     * @return number of records.
     */
    public int getNumRecords(String entityName) {
        return entities.get(entityName).getNumRecords();
    }

    public EnsuresState getEnsures() {
        return ensures;
    }

    public Map<String, Entity> getEntities() {
        return entities;
    }

    public SchemaMapping getSchemaMapping() {
        return schemaMapping;
    }


    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        if (ensures != null)
            s.append(ensures);
        else if (entities != null)
            if (entities.isEmpty())
                s.append("entities = {}");
            else {
                s.append("entities = {\n");

                for (Map.Entry<String, Entity> e : entities.entrySet()){
                    s.append(e.getValue().toString());
                    s.append("\n");
                }

                s.append("  }");
            }
        else if (schemaMapping != null)
            s.append(schemaMapping);

        return s.toString();
    }

}
