package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        //registra os professores Titulares
        DigitalHouseManager digitalHouseManager = new DigitalHouseManager();

        digitalHouseManager.registrarProfessorTitular("Mauro", "Silva", 301,
                "Full Stack");

        digitalHouseManager.registrarProfessorTitular("Claudia", "Souza", 302,
                "Android");

        //registra os professores Adjuntos
        digitalHouseManager.registrarProfessorAdjunto("Paula", "Mattos", 401,
                10);

        digitalHouseManager.registrarProfessorAdjunto("Carlos", "José", 402,
                5);

        //registra os cursos
        digitalHouseManager.registrarCurso("Full Stack", 20001, 3);

        digitalHouseManager.registrarCurso("Android", 20002, 2);

        //alocar professor titular e professor adjunto - Curso de Full Stack
        digitalHouseManager.alocarProfessores(20001, 301, 402);

        //alocar professor titular e professor adjunto - Curso de Android
        digitalHouseManager.alocarProfessores(20002, 302, 401);

        //matricula alunos
        digitalHouseManager.matricularAluno("Katia", "Fernandes", 501);
        //matricula alunos no curso de Full Stack
        digitalHouseManager.matricularAluno(501, 20001);

        digitalHouseManager.matricularAluno("Gabriel", "Assunção", 502);
        //matricula alunos no curso de Full Stack
        digitalHouseManager.matricularAluno(502, 20001);

        digitalHouseManager.matricularAluno("Fernando", "dos Santos", 503);
        //matricula alunos no curso de Android
        digitalHouseManager.matricularAluno(503, 20002);

        digitalHouseManager.matricularAluno("Marta", "Mendonça", 504);
        //matricula alunos no curso de Android
        digitalHouseManager.matricularAluno(504, 20002);

        digitalHouseManager.matricularAluno("Ana", "Barbosa", 505);
        //matricula alunos no curso de Android
        digitalHouseManager.matricularAluno(505, 20002);

        digitalHouseManager.exibirCursos();
    }
}