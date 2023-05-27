import entidades.*;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void maing (String[] args){

        List<EvaluacionPermanente> evaluacionPermanenteList = new ArrayList<>();
        evaluacionPermanenteList.add(new EvaluacionPermanente(15));
        evaluacionPermanenteList.add(new EvaluacionPermanente(18));
        evaluacionPermanenteList.add(new EvaluacionPermanente(20));
        evaluacionPermanenteList.add(new EvaluacionPermanente(19));

        Asignatura asignatura1 = new Asignatura();
        asignatura1.setDescripcion("Desarrollo de Aplicaciones I");
        asignatura1.setCredito(4);
        asignatura1.setCodigoUnico("NRC203564");
        asignatura1.setProfesor("Eduardo Zuñiga");
        asignatura1.setEvaluacionFinal(new EvaluacionFinal(20));
        asignatura1.setEvaluacionParcial(new EvaluacionParcial(20));
        asignatura1.setEvaluacionPermanentes(evaluacionPermanenteList);



        List<EvaluacionPermanente> evaluacionPermanenteList2 = new ArrayList<>();
        evaluacionPermanenteList2.add(new EvaluacionPermanente(19));
        evaluacionPermanenteList2.add(new EvaluacionPermanente(20));
        evaluacionPermanenteList2.add(new EvaluacionPermanente(19));
        evaluacionPermanenteList2.add(new EvaluacionPermanente(20));

        Asignatura asignatura2 = new Asignatura();
        asignatura2.setDescripcion("Desarrollo de apps modernas con SCRUM");
        asignatura2.setCredito(6);
        asignatura2.setCodigoUnico("NRC2023666");
        asignatura2.setProfesor("Eduardo Zuñiga");
        asignatura2.setEvaluacionFinal(new EvaluacionFinal(10));
        asignatura2.setEvaluacionParcial(new EvaluacionParcial(8));
        asignatura2.setEvaluacionPermanentes(evaluacionPermanenteList);



        List<Asignatura> asignaturas = new ArrayList<>();
        asignaturas.add(asignatura1);
        asignaturas.add(asignatura2);

        Alumno alumno1 = new Alumno();
        alumno1.setNombres("Aaron");
        alumno1.setApellidos("Lazo Zevallos");
        alumno1.setAsignaturas(asignaturas);
        List<Asignatura> listaAsignaturas = alumno1.getAsignaturas();




        Alumno alumno2 = new Alumno();
        alumno2.setNombres("Andrea");
        alumno2.setApellidos("Perez Matute");
        asignatura1.setEvaluacionParcial(new EvaluacionParcial(10));
        List<EvaluacionPermanente> evaluacionPermanentes = new ArrayList<>();
        evaluacionPermanentes.add(new EvaluacionPermanente(8));
        evaluacionPermanentes.add(new EvaluacionPermanente(15));
        evaluacionPermanentes.add(new EvaluacionPermanente(16));
        evaluacionPermanentes.add(new EvaluacionPermanente(20));
        asignatura1.setEvaluacionPermanentes(evaluacionPermanentes);
        asignatura1.setEvaluacionParcial(new EvaluacionParcial(10));


        //System.out.println(String.format("Al alumno {} le falta {} para aprobar el curso {}",
        //        alumno2.getNombres(), alumno2.?,alumno2.getAsignaturas().get(0).getDescripcion()));

        /*
        for(Asignatura asignatura : listaAsignaturas){
            String resultado = asignatura.estaAprobado()? "Aprobado" : "Desaprobado";
            System.out.println("En el curso de :" + asignatura.getDescripcion() + " el alumno esta:" + resultado
            + "con la nota final de " +asignatura.getNotaDefinitiva());
        }
        */

    }
}
