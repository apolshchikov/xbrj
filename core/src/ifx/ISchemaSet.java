package ifx;

import java.util.Map;

/**
 * Created by apolshchikov on 2016-03-11.
 */
public interface ISchemaSet {
    //Map<IQualifiedName, ISchemaElement> GlobalElements;
    //Map<IQualifiedName, ISchemaType> GlobalTypes;

    void Add(ISchema schemaToAdd);

    void Compile();
}
