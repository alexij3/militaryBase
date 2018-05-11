package com.vyshyvan.dao.corps;

import com.vyshyvan.datastorage.DataStorage;
import com.vyshyvan.model.Corps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CorpsDAOImpl implements CorpsDAO {
    @Autowired
    DataStorage dataStorage;

    @Override
    public Corps insertCorps(Corps corps) {
        dataStorage.getCorps().add(corps);
        return corps;
    }

    @Override
    public Corps getCorps(int id) {
        return dataStorage.getCorps().stream()
                .filter(el->el.getId()==id)
                .findFirst().orElse(null);
    }

    @Override
    public Corps updateCorps(Corps corps) {
        for(Corps a: dataStorage.getCorps())
        {
            if(a.getId() == corps.getId())
            {
                a.setCodeNumber(corps.getCodeNumber());
                a.setName(corps.getName());
                break;
            }
        }
        return corps;
    }



    @Override
    public Corps deleteCorps(int id) {
        Corps corps = dataStorage.getCorps()
                .stream()
                .filter(el -> el.getId() == id)
                .findFirst()
                .get();
        dataStorage.getCorps().remove(corps);
        return corps;
    }

    @Override
    public List<Corps> getAll() {
        return dataStorage.getCorps();
    }
}
