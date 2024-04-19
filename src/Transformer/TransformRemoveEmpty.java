package Transformer;

import java.util.Iterator;
import java.util.List;

public class TransformRemoveEmpty implements Transformer{
    @Override
    public List<String> transform(List<String> list) {
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            if(iterator.next().isBlank()) iterator.remove();
        }
        return list;
    }
}
