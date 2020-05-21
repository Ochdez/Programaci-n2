package Escuela;

import java.util.ArrayList;
import java.util.Random;

public class EscuelaFIE {
    protected String Nombre;
    protected ArrayList <Alumno> Alumnos;
    protected ArrayList <Profesor> Profesores;
    protected ArrayList <Materia> Materias;
    protected Random rand;
    
    public String nombres[] = {"JUAN", "JOSÃ‰ LUIS", "JOSÃ‰", "MARÃ�A GUADALUPE", 
    "FRANCISCO", "GUADALUPE", "MARÃ�A", "JUANA", "ANTONIO", "JESÃšS", "MIGUEL Ã�NGEL",
    "PEDRO", "ALEJANDRO", "MANUEL", "MARGARITA", "MARÃ�A DEL CARMEN", "JUAN CARLOS", 
    "ROBERTO", "FERNANDO", "DANIEL", "CARLOS", "JORGE", "RICARDO", "MIGUEL", 
    "EDUARDO", "JAVIER", "RAFAEL","MARTÃ�N", "RAÃšL", "DAVID", "JOSEFINA", "JOSÃ‰ ANTONIO",
    "ARTURO", "MARCO ANTONIO", "JOSÃ‰ MANUEL", "FRANCISCO JAVIER", "ENRIQUE", "VERÃ“NICA",
    "GERARDO", "MARÃ�A ELENA", "LETICIA", "ROSA", "MARIO", "FRANCISCA", "ALFREDO", 
    "TERESA", "ALICIA", "MARÃ�A FERNANDA", "SERGIO", "ALBERTO", "LUIS", "ARMANDO",
    "ALEJANDRA", "MARTHA", "SANTIAGO", "YOLANDA", "PATRICIA", "MARÃ�A DE LOS Ã�NGELES",
    "JUAN MANUEL", "ROSA MARÃ�A", "ELIZABETH", "GLORIA", "Ã�NGEL", "GABRIELA", 
    "SALVADOR", "VÃ�CTOR MANUEL", "SILVIA", "MARÃ�A DE GUADALUPE", "MARÃ�A DE JESÃšS",
    "GABRIEL", "ANDRÃ‰S", "Ã“SCAR", "GUILLERMO", "ANA MARÃ�A", "RAMÃ“N", "MARÃ�A ISABEL",
    "PABLO", "RUBEN", "ANTONIA", "MARÃ�A LUISA", "LUIS Ã�NGEL", "MARÃ�A DEL ROSARIO",
    "FELIPE", "JORGE JESÃšS", "JAIME", "JOSÃ‰ GUADALUPE", "JULIO CESAR", "JOSÃ‰ DE JESÃšS",
    "DIEGO", "ARACELI", "ANDREA", "ISABEL", "MARÃ�A TERESA", "IRMA", "CARMEN", "LUCÃ�A",
    "ADRIANA", "AGUSTÃ�N", "MARÃ�A DE LA LUZ", "GUSTAVO"};
    
    public String apellidos[] = {"GARCIA", "GONZALEZ", "RODRIGUEZ", "FERNANDEZ", 
    "LOPEZ", "MARTINEZ", "SANCHEZ", "PEREZ", "GOMEZ", "MARTIN", "JIMENEZ", "RUIZ", 
    "HERNANDEZ", "DIAZ", "MORENO", "ALVAREZ", "MUÃ‘OZ", "ROMERO", "ALONSO", "GUTIERREZ",
    "NAVARRO", "TORRES", "DOMINGUEZ", "VAZQUEZ", "RAMOS", "GIL", "RAMIREZ", "SERRANO",
    "BLANCO", "SUAREZ", "MOLINA", "MORALES", "ORTEGA", "DELGADO", "CASTRO", "ORTIZ", 
    "RUBIO", "MARIN", "SANZ", "NUÃ‘EZ", "IGLESIAS", "MEDINA", "GARRIDO", "SANTOS",
    "CASTILLO", "CORTES", "LOZANO", "GUERRERO", "CANO", "PRIETO", "MENDEZ", 
    "CALVO", "CRUZ", "GALLEGO", "VIDAL", "LEON", "HERRERA", "MARQUEZ", "PEÃ‘A", 
    "CABRERA", "FLORES", "CAMPOS", "VEGA", "DIEZ", "FUENTES", "CARRASCO", 
    "CABALLERO", "NIETO", "REYES", "AGUILAR", "PASCUAL", "HERRERO", "SANTANA",
    "LORENZO", "HIDALGO", "MONTERO", "IBAÃ‘EZ", "GIMENEZ", "FERRER", "DURAN", 
    "VICENTE", "BENITEZ", "MORA", "SANTIAGO", "ARIAS", "VARGAS", "CARMONA", 
    "CRESPO", "ROMAN", "PASTOR", "SOTO", "SAEZ", "VELASCO", "SOLER", "MOYA", 
    "ESTEBAN", "PARRA", "BRAVO", "GALLARDO", "ROJAS"};
    
    private String Mat[][] = {{"Ã�lgebra superior", "Calculo I", "FÃ­sica I", "QuÃ­mica", "InglÃ©s I",
    "Laboratorio de CÃ¡lculo I", "Laboratorio de fÃ­sica I", "Laboratorio de QuÃ­mica",
    "Laboratorio de herramientas computacionales"}, {"CÃ¡lculo II", "FÃ­sica II", 
    "ProgramaciÃ³n de Computadoras", "TecnologÃ­a de materiales", "InglÃ©s II", 
    "Laboratorio de fÃ­sica II", "Laboratorio de programaciÃ³n de computadoras"},
    {"CÃ¡lculo III", "TeorÃ­a electromagnÃ©tica I","TermodinÃ¡mica", "FÃ­sica III", 
     "InglÃ©s III", "Laboratorio de teorÃ­a electromagnÃ©tica I", "Laboratorio de fÃ­sica III"
     , "Laboratorio de termodinÃ¡mica"}, {"CÃ¡lculo IV", "TeorÃ­a electromagnÃ©tica II",
    "MÃ©todos numÃ©ricos", "Circuitos elÃ©ctricos I", "InglÃ©s IV", 
    "Laboratorio de teorÃ­a electromagnÃ©tica II"}, {"Ã�lgebra lineal", "MÃ¡quinas elÃ©ctricas I", 
    "Probabilidad y estadÃ­stica", "ElectrÃ³nica analÃ³gica I", "MÃ¡quinas hidrÃ¡ulicas",
    "Circuitos elÃ©ctricos II", "Laboratorio de mÃ¡quinas elÃ©ctricas I", "Laboratorio de electrÃ³nica analÃ³gica I"},
    {"MÃ¡quinas elÃ©ctricas II", "InstrumentaciÃ³n I", "Instalaciones elÃ©ctricas", 
     "Centrales elÃ©ctricas", "EconomÃ­a", "Control analÃ³gico I", "ElectrÃ³nica analÃ³gica II",
     "Laboratorio de electrÃ³nica analÃ³gica II", "Laboratorio de mÃ¡quinas elÃ©ctricas II",
     "Laboratorio de instrumentaciÃ³n I","Laboratorio de control analÃ³gico I"},
    {"Ã‰tica profesional", "ElectrÃ³nica digital I", "ElectrÃ³nica analÃ³gica III",
     "MÃ¡quinas elÃ©ctricas III", "ElectrometrÃ­a", "Control analÃ³gico II", 
     "Laboratorio de electrÃ³nica analÃ³gica III", "Laboratorio de electrÃ³nica digital I",
     "Laboratorio de mÃ¡quinas elÃ©ctricas III", "Laboratorio de electrometrÃ­a", 
     "Laboratorio de control analÃ³gico II"}, {"ElectrÃ³nica de potencia I",
     "Control de mÃ¡quinas elÃ©ctricas I", "Sistemas elÃ©ctricos de distribuciÃ³n I",
     "Sistemas elÃ©ctricos de potencia I", "Subestaciones elÃ©ctricas", 
     "ProtecciÃ³n y Control de Sistemas ElÃ©ctricos I", "Contabilidad",
     "Sistemas elÃ©ctricos industriales", "Laboratorio de electrÃ³nica de potencia I",
     "Laboratorio de control de mÃ¡quinas elÃ©ctricas I"},{"Fuentes alternas de energÃ­a",
     "AdministraciÃ³n", "Tema selecto", "Laboratorio de tema selecto"},
     {"ExpresiÃ³n oral y escrita", "Seminario de tesis"}
    };
    
    public void Agrega_Alumno(Alumno unAlumno) {
        Alumnos.add(unAlumno);
    }
    
    public void Agrega_Materia(Materia unaMateria) {
        Materias.add(unaMateria);
    }
    
    public void Agrega_Profesor(Profesor unProfesor) {
        Profesores.add(unProfesor);
    }
    void Lee_Materia() {
        int Nr, Nc, r, c;
        int k=1;


        Nr = Mat.length;

        for(r=0; r<Nr; r++) {
            Nc = Mat[r].length;
            for(c=0; c<Nc; c++){
               Agrega_Materia(new Materia("M"+String.format("%04d", k), Mat[r][c], 3+rand.nextInt()%2, r+1));
               k++;
            }
        }
        
    }
    
    public void Lee_Profesores() {
        int i, N, j;
        N = NumAle(10, 30);

        Profesor unProfe;
                
        for(i=0; i<N; i++) {
            unProfe = new Profesor(nombres[NumAle(1,50)], apellidos[NumAle(1,50)],
                    apellidos[NumAle(1,50)], " ", " ", " ", "Morelia", "Michoacan", 
                    " ", FechaAle(1960, 1975), String.format("P%03d", (i+1)));
            Profesores.add(unProfe);
        }
        
        for(Materia m : Materias){
            i = NumAle(0, N-1);
            Profesores.get(i).agrega_materia(m);
        }         
    }
    
    void Lee_Alumnos() {
        int Nal, i, sem;
        int Nr= 10, Nc, r, c, k=0, sec;
        
        Nal = NumAle(100, 800);
        Alumno unAlum;
             
        for(i=0; i<Nal; i++) {
            sem = NumAle(0, 9);
            unAlum = new Alumno(nombres[NumAle(1,50)], apellidos[NumAle(1,50)],
                    apellidos[NumAle(1,50)], " ", " ", " ", "Morelia", "Michoacan", 
                    " ", FechaAle(2000-sem/2, 2005-sem/2), String.format("a%03d", (i+1)));
            k=0;
            for(r=0; r < Nr; r++){
                sec = 1+Math.abs(rand.nextInt())%2;
                Nc = Mat[r].length;
                for (c=0; c < Nc; c++){
                    if(r > sem) break;
                    unAlum.agrega_Curso(new Curso(Materias.get(k++), String.format("%02d", sec), NumAle(6, 10)));
                }
            }
            Alumnos.add(unAlum);
        }      
        
    }
    
    int existeMateria(String unaClave) {
        int k =0;
        
        for(Materia i: Materias) {
            if(unaClave.equals(i.getClave())) return k;
            k++;
        }
        
        return -1;
    }
        
    public int NumAle(int inf, int sup) {
        return (inf + Math.abs(1+rand.nextInt()%(sup-inf)) );
    }
    
    public Fecha FechaAle(int ini, int fin) {
        int dmes[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int d, m, a;
        
        a = NumAle(ini, fin);
        m = NumAle(1, 12);
        d = NumAle(1, dmes[m-1]);
        
      
        return new Fecha(d, m, a);
    }
    
    public EscuelaFIE(){
        Nombre = "Facultad de IngenierÃ­a Electrica";
        rand = new Random(100l);
                
        Alumnos = new ArrayList <Alumno> ();
        Profesores = new ArrayList <Profesor> ();
        Materias = new ArrayList <Materia>();
        Lee_Materia();
        Lee_Profesores();
        Lee_Alumnos();
    }
    
    @Override
    public String toString() {
        return "";
    }
    
}
