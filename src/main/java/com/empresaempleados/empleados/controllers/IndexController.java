package com.empresaempleados.empleados.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.empresaempleados.empleados.models.Empleado;

@Controller
public class IndexController {
    
    @GetMapping({"/index", "/home", "/", ""})
    public String index(Model model){
        model.addAttribute("titulo", "Empresa - Empleados");
        List<Empleado> empleados = getAllEmpleados();
        model.addAttribute("empleados", empleados);
        return "index";
    }

    public List<Empleado> getAllEmpleados(){
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado("Jaider", "Mendoza", "jmendoza@gmail.com", "Horas", 150));
        empleados.add(new Empleado("Robin","Spencer","purus.duis@aol.ca", "Tiempo Completo", 0));
        empleados.add(new Empleado("Travis","Wyatt","cum@yahoo.couk", "Horas", 140));
        empleados.add(new Empleado("Kyra","Mooney","est@icloud.edu", "Tiempo Completo mas Bonificaciones", 0));
        empleados.add(new Empleado("Tyler","Chang","semper.pretium@google.edu", "Tiempo Completo", 0));
        empleados.add(new Empleado("Lucian","Graham","luctus.aliquet.odio@yahoo.net", "Tiempo Completo mas Bonificaciones", 0));
        empleados.add(new Empleado("Cheyenne","Velazquez","sagittis@protonmail.edu", "Horas", 220));
        empleados.add(new Empleado("Malachi","Cruz","duis.a@protonmail.net", "Horas", 215));
        empleados.add(new Empleado("Deacon","Martinez","ultricies.adipiscing@icloud.net", "Tiempo Completo", 0));
        empleados.add(new Empleado("Timothy","Gates","suspendisse.ac@hotmail.couk", "Tiempo Completo", 0));
        empleados.add(new Empleado("Cairo","Battle","nec.orci@hotmail.ca", "Horas", 215));
        empleados.add(new Empleado("Bell","Kirkland","sed.consequat@google.edu", "Horas", 280));
        empleados.add(new Empleado("Iona","Green","eu.nulla@yahoo.couk", "Tiempo Completo mas Bonificaciones", 0));
        empleados.add(new Empleado("Ulysses","Compton","etus.aliquam@outlook.couk", "Horas", 145));
        empleados.add(new Empleado("Cooper","Chapman","mollis.phasellus@protonmail.com", "Horas", 120));
        empleados.add(new Empleado("Mufutau","Grimes","lobortis.tellus@protonmail.com", "Tiempo Completo mas Bonificaciones", 0));
        empleados.add(new Empleado("Ruby","Salinas","scelerisque@google.couk", "Horas", 190));
        empleados.add(new Empleado("Matthew","Levy","duis.ac@yahoo.ca", "Tiempo Completo", 0));
        empleados.add(new Empleado("Morgan","Wong","vel.arcu@aol.couk", "Horas", 200));
        empleados.add(new Empleado("Anthony","Baldwin","sagittis.lobortis.mauris@hotmail.edu", "Tiempo Completo mas Bonificaciones", 0));

        return empleados;
    }

}
