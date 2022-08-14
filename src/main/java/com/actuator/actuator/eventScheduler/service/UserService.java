// package com.actuator.actuator.eventScheduler.service;

// import java.util.*;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.scheduling.annotation.Scheduled;
// import org.springframework.stereotype.Service;

// import com.actuator.actuator.eventScheduler.dao.UserDao;
// import com.actuator.actuator.eventScheduler.model.User;

// @Service
// public class UserService {

// @Autowired
// private UserDao dao;

// Logger log = LoggerFactory.getLogger(UserService.class);

// // schedule a job to add to database in every 5 seconds
// @Scheduled(fixedRate = 5000)
// public void add2DBJob() {
// User user = new User();
// user.setName("user" + new Random().nextInt(374483));
// dao.save(user);
// System.out.printf(" %s ", "Add service call in " + new Date().toString());
// }

// // schedule a job to get to database in every 5 seconds
// @Scheduled(cron = "0/15 * * * * *")
// public void fetchDbJob() {
// List<User> users = dao.findAll();
// System.out.printf(" %s ", "fetch service call in " + new Date().toString());
// System.out.printf(" %s ", "number of record fetch : " + users.size());
// log.info("user : {}", users);
// }

// }
