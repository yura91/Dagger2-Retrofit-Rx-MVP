package com.sergiocrespotoubes.mvpdagger2retrofitroomrxjava.database.repository;

import com.sergiocrespotoubes.mvpdagger2retrofitroomrxjava.database.DataSource;
import com.sergiocrespotoubes.mvpdagger2retrofitroomrxjava.database.entity.User;



public interface UserRepository extends DataSource<User> {

    User getUser();

}
