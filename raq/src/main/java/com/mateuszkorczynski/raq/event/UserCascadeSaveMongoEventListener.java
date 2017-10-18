package com.mateuszkorczynski.raq.event;

import com.mateuszkorczynski.raq.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;

/**
 * Created by MAKORCZY on 2017-10-16.
 */
public class UserCascadeSaveMongoEventListener extends AbstractMongoEventListener<Object> {
    @Autowired
    private MongoOperations mongoOperations;

    @Override
    public void onBeforeConvert(final BeforeConvertEvent<Object> event) {
        final Object source = event.getSource();
        if ((source instanceof User) && (((User) source).getEmailAddress() != null)) {
            mongoOperations.save(((User) source).getEmailAddress());
        }
    }
}
