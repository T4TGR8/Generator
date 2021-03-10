module Generator {
    opens magus;
    opens magus.controllers;
    opens magus.model;
    opens magus.dao;

    requires javafx.fxml;
    requires javafx.controls;
    requires org.hibernate.orm.core;
    requires org.hibernate.commons.annotations;
    requires java.naming;
}