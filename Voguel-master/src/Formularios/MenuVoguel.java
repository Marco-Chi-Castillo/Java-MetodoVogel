package Formularios;

import java.io.BufferedReader;
import java.io.File;
import javax.swing.JTable;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class MenuVoguel extends javax.swing.JFrame {
    //Almacenamiento de datos para enviar al otro Jframe

    ArrayList<String> ListProcesos = new ArrayList();
    ArrayList<Integer> ListMultiplicaciones = new ArrayList();

    VentanaResultados Ventana2 = new VentanaResultados();


    public MenuVoguel() {
        initComponents();
        this.setTitle("Metodo Vogel");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtFilas = new javax.swing.JTextField();
        txtColumnas = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        BtnVer = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BtnGuardar = new javax.swing.JButton();
        BtnOpciones = new javax.swing.JButton();
        BtnAbrir = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaProceso = new javax.swing.JTable();
        BtnProceso = new javax.swing.JButton();
        TxtMensajes = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BtnResultados = new javax.swing.JButton();
        BtnReiniciarProcesos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jScrollPane1.setName("tableValues"); // NOI18N

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setCellSelectionEnabled(true);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setName("tableValues"); // NOI18N
        jTable1.setUpdateSelectionOnSort(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getAccessibleContext().setAccessibleName("");
        jTable1.getAccessibleContext().setAccessibleDescription("");

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        BtnVer.setBackground(new java.awt.Color(204, 204, 204));
        BtnVer.setText("Resolver");
        BtnVer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnVerMouseClicked(evt);
            }
        });
        BtnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVerActionPerformed(evt);
            }
        });

        jLabel2.setText("Filas");

        jLabel3.setText("Columnas");

        BtnGuardar.setBackground(new java.awt.Color(204, 204, 204));
        BtnGuardar.setText("Guardar");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        BtnOpciones.setBackground(new java.awt.Color(255, 255, 102));
        BtnOpciones.setText("Opciones");
        BtnOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOpcionesActionPerformed(evt);
            }
        });

        BtnAbrir.setBackground(new java.awt.Color(204, 204, 204));
        BtnAbrir.setText("Abrir");
        BtnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAbrirActionPerformed(evt);
            }
        });

        BtnCancelar.setBackground(new java.awt.Color(255, 51, 51));
        BtnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        TablaProceso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TablaProceso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(TablaProceso);

        BtnProceso.setBackground(new java.awt.Color(102, 153, 255));
        BtnProceso.setForeground(new java.awt.Color(255, 255, 255));
        BtnProceso.setText("Siguiente");
        BtnProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnProcesoActionPerformed(evt);
            }
        });

        TxtMensajes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TxtMensajes.setForeground(new java.awt.Color(0, 51, 204));

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("METODO VOGEL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        BtnResultados.setBackground(new java.awt.Color(153, 255, 153));
        BtnResultados.setText("Resultado");
        BtnResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResultadosActionPerformed(evt);
            }
        });

        BtnReiniciarProcesos.setBackground(new java.awt.Color(255, 255, 102));
        BtnReiniciarProcesos.setText("Reiniciar");
        BtnReiniciarProcesos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReiniciarProcesosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(177, 177, 177)
                                .addComponent(BtnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFilas)
                            .addComponent(BtnVer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(txtColumnas)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TxtMensajes, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnProceso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnResultados, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addComponent(BtnReiniciarProcesos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFilas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(BtnVer, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(BtnProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnResultados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnReiniciarProcesos)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtMensajes, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

      public int[] MezclaDirecta(int []arreglo){
        int i, j ,k;
        if(arreglo.length > 1){
            
            int nElementosIzq = arreglo.length/2;
            int nElementosDer = arreglo.length - nElementosIzq;
            int arregloIzq[] = new int [nElementosIzq];
            int arregloDer[] = new int [nElementosDer];
            
            //copiando los elementos de parte primera al areglo izquierdo
            
            for(i = 0; i < nElementosIzq; i++){
                arregloIzq[i] = arreglo[i];
            }
            
            for(i = nElementosIzq; i < nElementosIzq + nElementosDer; i++){
                arregloDer[i-nElementosIzq] = arreglo[i];
            }
            
            //Recursividad
            arregloIzq = MezclaDirecta(arregloIzq);
            arregloDer = MezclaDirecta(arregloDer);
            
            i = 0;
            j = 0;
            k = 0;
            
            while(arregloIzq.length != j && arregloDer.length != k){
                if(arregloIzq[j] < arregloDer[k]){
                    arreglo[i] = arregloIzq[j];
                    i++;
                    j++;
                }else{
                    arreglo[i] = arregloDer[k];
                    i++;
                    k++;
                }
            }
            
            //arreglo final
            while(arregloIzq.length != j){
                arreglo[i] = arregloIzq[j];
                i++;
                j++;
            }
             while(arregloDer.length != k){
                arreglo[i] = arregloDer[k];
                i++;
                k++;
            }
        }
        return arreglo;
    }

 /*
    == BUSCA EL INDICE DE UN DATO DENTRO CUALQUIER ARREGLO, SI NO ENCUENTRA EL
    DATO RETORNA -1.
     */
 public static int GetIndice(int vector[], int dato) {
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == dato) {
                return i;
            }
        }
        return -1;
    }

 /*
    == GUARDA LOS DATOS EN UNA MATRIZ PARA SU MANIPULACION.
     */
 public void GuardarDatosEnMatriz(int[][] matriz, JTable tabla) {
        for (int i = 0; i < tabla.getRowCount(); i++) {
            for (int x = 0; x < tabla.getColumnCount(); x++) {
                matriz[i][x] = Integer.parseInt(tabla.getValueAt(i, x).toString());
            }
        }
    }

 /*
    == GUARDA LOS DATOS DE LA TABLA EN UN TEXTO MEDIANTE SU ARREGLO CON SUS VALORES.
     */
  public void GuardarDatosTxt(int[][] matriz) {
        try {
            JFileChooser file = new JFileChooser();
            file.showSaveDialog(this);
            File guarda = file.getSelectedFile();
            if (guarda != null) {
                //Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
                File archivo = new File(guarda + ".txt");
//Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
                FileWriter escribir = new FileWriter(archivo, true);

//Escribimos en el archivo con el metodo write 
                for (int i = 0; i < jTable1.getRowCount(); i++) {
                    for (int x = 0; x < jTable1.getColumnCount(); x++) {
                        escribir.write(matriz[i][x] + " ");
                    }
                }
//Cerramos la conexion
                escribir.close();
                JOptionPane.showMessageDialog(null, "Guardado correctamente");
            } //Si existe un problema al escribir cae aqui
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error Al Guardar");
        }
    }

 /*
    ==ABRE EL ARCHIVO Y A LA VEZ PASA LA INFORMACION EN UN ARREGLO STRING.
     */
 public String[] AbrirArchivo(){
        String[] parts = new String[jTable1.getRowCount() * jTable1.getColumnCount()];
        try {
            JFileChooser file = new JFileChooser();
            file.showOpenDialog(this);
            File abre = file.getSelectedFile();
            FileReader ficha = new FileReader(abre); //captura del archivo
            BufferedReader dato = new BufferedReader(ficha); //Lectura del archivo.

            String linea = "";

            while (linea != null) { //Cuando es -1 ya no hay texto que mostrar.
                linea = dato.readLine(); //Lee cada palabra almacenada en un archivo.

                if (linea != null) {
                    parts = linea.split(" ");
                }
            }
        } catch (Exception ex) { //Excepcion si encuentra un problema.
            JOptionPane.showMessageDialog(null, "Archivo No encontrado");
        }
        return parts;
    }

 /*
    == LLENA LA TABLA PRINCIPAL CON LOS VALORES DE LA MATRIZ.
     */
 public void LlenarTabla(String[] Datos) {
        int c = 0;
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            for (int x = 0; x < jTable1.getColumnCount(); x++) {
                jTable1.setValueAt(Datos[c], i, x);
                c++;
            }
        }
    }

 /*
    == DEVUELVE UN ARREGLO DONDE ESTAN ALMACENADOS SOLO LA DISPONIBILIDAD
     */
 public int[] Disponibilidad(JTable tabla) {
        int fila = tabla.getRowCount() - 1;
        int col = tabla.getColumnCount() - 1;
        int[] Disp = new int[fila];

        for (int i = 0; i < fila; i++) {
            Disp[i] = Integer.parseInt(tabla.getValueAt(i, col).toString());
        }
        return Disp;
    }

 /*
    == DEVUELVE UN ARREGLO DONDE ESTAN ALMACENADOS SOLO LA DEMANDA
     */
 public int[] Demanda(JTable tabla) {
        int fila = tabla.getRowCount() - 1;
        int col = tabla.getColumnCount() - 1;
        int[] demanda = new int[col];

        for (int i = 0; i < col; i++) {
            demanda[i] = Integer.parseInt(tabla.getValueAt(fila, i).toString());
        }
        return demanda;
    }

 /*
    == RETORNA LA MULTA DE LAS FILAS TOMANDO LOS VALORES MAS PEQUEÑOS.
     */
  public int getMulta(int sortRow[]) {
        MezclaDirecta(sortRow);
        int dato = 0;
        if (sortRow.length > 1) { //cuando existe mas de un dato en el arreglo
            dato = sortRow[1] - sortRow[0];
        } else if (sortRow.length == 1) { //Cuando solo una dato
            dato = sortRow[0];
        }
        return dato;
    }

 /*
     == DEVUELVE UNA MATRIZ CON LAS MULTAS DE LAS FILAS PARA LA DISPONIBILIDAD
     */
 public int[] MultaDisponibilidad(JTable tabla) {
        int row = tabla.getRowCount(); //numero de filas
        int col = tabla.getColumnCount(); //numeros de columnas
        int[][] DatosMatriz = new int[row][col]; //crea una matriz dimensional

        int[] MultaDisp = new int[tabla.getRowCount() - 1];

        GuardarDatosEnMatriz(DatosMatriz, tabla); //Los guarda en un la matriz
        int[] Temp = new int[col - 1]; //crea un arreglo temporal para guardar los datos de cada fila
        for (int i = 0; i < row - 1; i++) {
            for (int j = 0; j < col - 1; j++) {
                Temp[j] = DatosMatriz[i][j]; //Guarda cada fila de la tabla en Temp
            }
            MultaDisp[i] = getMulta(Temp); //manda Temp para obtener la multa y lo almacena en MultaDisp
        }
        return MultaDisp;
    }

 /*
     == DEVUELVE UNA MATRIZ CON LAS MULTAS DE LAS COLUMNAS PARA LA DEMANDA
     */
 public int[] MultaDemanda(JTable tabla) {
        int row = tabla.getRowCount(); //numero de filas
        int col = tabla.getColumnCount(); //numeros de columnas
        int[][] DatosMatriz = new int[row][col]; //crea una matriz dimensional

        int[] MultaDemanda = new int[col - 1];

        GuardarDatosEnMatriz(DatosMatriz, tabla); //Los guarda en un la matriz
        int[] Temp = new int[row - 1]; //crea un arreglo temporal para guardar los datos de cada columna
        for (int i = 0; i < col - 1; i++) {
            for (int j = 0; j < row - 1; j++) {
                Temp[j] = DatosMatriz[j][i]; //Almacena los datos de cada columna en Temp
            }
            MultaDemanda[i] = getMulta(Temp); //Manda Temp para obtener la multa de cada columna
        }
        return MultaDemanda;
    }

 /*
     == DEVUELVE LA MULTA MAS GRANDE TOMANDO TANTO DE DEMANDA Y DISPONIBILIDAD
     */
 public int MayorMulta(int[] dispoMulta, int[] demanMultas) {

        int[] Union = new int[dispoMulta.length + demanMultas.length]; //Crea un arreglo para almacenar todas las multas.
        //Union de las dos arreglo a una sola.
        System.arraycopy(dispoMulta, 0, Union, 0, dispoMulta.length);
        System.arraycopy(demanMultas, 0, Union, dispoMulta.length, demanMultas.length);

        MezclaDirecta(Union); //Ordenada las Multas
        return Union[Union.length - 1]; //Devuelve el mas Grande
    }

 /*
     == DEVUELVE EL DATO MAS PEQUEÑO DENTRO DE UN ARREGLO.
     */
   public int MenorDatos(int[] datos) {
        MezclaDirecta(datos);
        return datos[0];
    }

 /*
     == DEVUELVE EL INDICE O POSICION DE LA MULTA MAS GRANDE DETERMINANDO SI ESTA EN 
    DISPONIBILIDAD O DEMANDA, O EN AMBAS
     */
 public int[] BuscarMultaIndices(int[] dispoMultas, int[] demanMultas) {
        //Manda la mayor multa junto con el arreglo de MultaDisp y busca su posicion.
        int i = GetIndice(dispoMultas, MayorMulta(dispoMultas, demanMultas)); //disponibilidad
        int j = GetIndice(demanMultas, MayorMulta(dispoMultas, demanMultas)); //demanda
        return new int[]{i, j};
    }

 /*
     == DETERMINA SI LA MAYOR MULTA ESTA EN DISPONIBILIDAD, DEMANDA O SON EN AMBAS.
     */
    public void Comparacion(int[] demanMultas, int[] dispoMulta, JTable tabla) {
        //arreglo con toda la disponibilidad y demanda.
        int[] Arrdisponibilidad = Disponibilidad(tabla);
        int[] Arrdemanda = Demanda(tabla);

        int[] indices = BuscarMultaIndices(dispoMulta, demanMultas);

        int Indisp = indices[0]; //indice de multa disponibilidad mas grande
        int Indeman = indices[1]; //indice de multa demanda mas grande

        if (Indisp != -1 && Indeman == -1) { //si el mas grande esta en disponibilidad
            int Valor_Disp = Arrdisponibilidad[Indisp]; //valor de la disponibilidad
            int[] datos = Valor_indiceDeman(Indisp); //Retorna valor de la demanda y su indice
            int valor = datos[0]; //valor de la demanda mas pequeño
            int IndiceDemanda = datos[1]; //el indice de la demanda.
            ActualizacionDeDatos(Valor_Disp, Arrdemanda[IndiceDemanda], valor, Indisp, IndiceDemanda, tabla);

        } else if (Indeman != -1 && Indisp == -1) { //si el mas grande esta en demanda.
            int Valor_Deman = Arrdemanda[Indeman]; //valor de la demanda
            int[] datos = Valor_indiceDisp(Indeman); //Retorna valor de la disponibilidad y su indice
            int valor = datos[0]; //valor de la disponibilidad
            int IndiceDisponibilidad = datos[1]; //su indice.
            ActualizacionDeDatos(Arrdisponibilidad[IndiceDisponibilidad], Valor_Deman, valor, IndiceDisponibilidad, Indeman, TablaProceso);

            //En caso que sean iguales, debe saber que eliminar si una demanda o disponibilidad.
            //se realiza otra funcion aparte.
        } else if (Indisp != -1 && Indeman != -1) {
            DemandaDisponibilidadIguales(Indeman, Indisp, Arrdisponibilidad, Arrdemanda, tabla);
        }
    }

    /*
     == EVALUA LAS DOS MULTAS IGUALES, Y DETERMINAR SI ELIMINAR UNA FILA O COLUMNA.
    DETERMINA CUAL ELIMINAR A PARTIR DE SUS DATOS INTERNOS.
     */
    public void DemandaDisponibilidadIguales(int Indeman, int InDisp, int[] Disponibilidad, int[] Demanda, JTable tabla) {
        //Buscar el dato mas pequeño y su indice. 
        int DatosDeman[] = Valor_indiceDeman(InDisp); //Mas pequeño de la demanda y su indice
        int DatosDisp[] = Valor_indiceDisp(Indeman); //Mas pequeño de la disponibilidad y su indice

        int ValorMenorDeman = DatosDeman[0]; //Valor mas pequeño de Demanda(fila)
        int ValorMenorDisp = DatosDisp[0]; //Valor mas pequeño de Disponibilidad(columna)

        int IndiceDemanda = DatosDeman[1]; //Indice para ubicar la demanda.
        int IndiceDisponibilidad = DatosDisp[1]; //Indice para ubicar la disponibilidad

        if (ValorMenorDeman < ValorMenorDisp) { //evalua quien es mas pequeño
            //Si demanda es mas pequeño eliminara una columna
            int Valor_Disp = Disponibilidad[InDisp];
            ActualizacionDeDatos(Valor_Disp, Demanda[IndiceDemanda], ValorMenorDeman, InDisp, IndiceDemanda, TablaProceso);
        } else {
            //si disponibilidad es mas pequeño eliminara una fila
            int Valor_Deman = Demanda[Indeman];
            ActualizacionDeDatos(Disponibilidad[IndiceDisponibilidad], Valor_Deman, ValorMenorDisp, IndiceDisponibilidad, Indeman, TablaProceso);
        }
    }

    /*
     == EVALUA QUE ELIMINAR Y ACTUALIZA LOS DATOS DE LA TABLA (DISPONIBILIDAD Y DEMANDA)
     */
    public void ActualizacionDeDatos(int Valordisp, int ValorDeman, int MenorValor, int IndDisp, int IndDeman, JTable tabla) {
        if (Valordisp > ValorDeman) { //Si disponibilidad es mas grande, eliminara una columna
            TxtMensajes.setText("Operacion: " + MenorValor + " x " + ValorDeman + " = " + (MenorValor * ValorDeman));

            //Almacenamiento de datos en ArrayLista para la VentanaResultados
            ListProcesos.add(MenorValor + " x " + ValorDeman + " = " + (MenorValor * ValorDeman));
            ListMultiplicaciones.add((MenorValor * ValorDeman));

            //ACtualizacion de datos
            tabla.setValueAt((Valordisp - ValorDeman), IndDisp, tabla.getColumnCount() - 1);
            tabla.setValueAt(0, tabla.getRowCount() - 1, IndDeman);

            EliminacionDeColumnas(IndDeman);
        } else if (ValorDeman > Valordisp) { //si demanda es mas grande, elimina una fila.
            TxtMensajes.setText("Operacion: " + MenorValor + " x " + Valordisp + " = " + (MenorValor * Valordisp));

            //Almacenamiento de datos en ArrayLista para la VentanaResultados
            ListProcesos.add(MenorValor + " x " + Valordisp + " = " + (MenorValor * Valordisp));
            ListMultiplicaciones.add((MenorValor * Valordisp));

            //ACtualizacion de datos
            tabla.setValueAt(0, IndDisp, tabla.getColumnCount() - 1);
            tabla.setValueAt((ValorDeman - Valordisp), tabla.getRowCount() - 1, IndDeman);

            EliminacionDeFilas(IndDisp);
        } else if (ValorDeman == Valordisp) {
            TxtMensajes.setText("Operacion: " + MenorValor + " x " + Valordisp + " = " + (MenorValor * Valordisp));

            //Almacenamiento de datos en ArrayLista para la VentanaResultados
            ListProcesos.add(MenorValor + " x " + Valordisp + " = " + (MenorValor * Valordisp));
            ListMultiplicaciones.add((MenorValor * Valordisp));

            //Elimina directamente la columna y fila porque la demanda y disponibilidad son iguales.
            EliminacionDeFilas(IndDisp);
            EliminacionDeColumnas(IndDeman);

        }
    }

    /*
     == RETORNA EL MAS PEQUEÑO DE TODA UNA COLUMNA(DEMANDA) Y SU INDICE
     */
 public int[] Valor_indiceDeman(int Indisp) {
        int col = TablaProceso.getColumnCount(); //numeros de columnas
        int[] fila_ordenado = new int[col - 1]; //Para ordenar
        int[] fila_desor = new int[col - 1]; //para buscar indice
        for (int i = 0; i < col - 1; i++) {
            //copia los valores de la columna a los arreglos.
            fila_ordenado[i] = Integer.parseInt(TablaProceso.getValueAt(Indisp, i).toString());
            fila_desor[i] = Integer.parseInt(TablaProceso.getValueAt(Indisp, i).toString());
        }
        int dato = MenorDatos(fila_ordenado); //obtiene el mas pequeño de la columna
        int i = GetIndice(fila_desor, dato); //obtine su indice
        return new int[]{dato, i};
    }
 /*
     == RETORNA EL MAS PEQUEÑO DE TODA UNA FILA(DISPONIBILIDAD) Y SU INDICE
     */

 public int[] Valor_indiceDisp(int IndDeman) {

        int row = TablaProceso.getRowCount(); //numero de filas

        int[] columna_ordenado = new int[row - 1];
        int[] columna_desor = new int[row - 1];
        for (int j = 0; j < row - 1; j++) {
            //copia los valores de la fila a los arreglos.
            columna_ordenado[j] = Integer.parseInt(TablaProceso.getValueAt(j, IndDeman).toString());
            columna_desor[j] = Integer.parseInt(TablaProceso.getValueAt(j, IndDeman).toString());
        }
        int dato = MenorDatos(columna_ordenado); //obtiene el mas pequeño de las filas
        int i = GetIndice(columna_desor, dato); //retorna su indice del mas pequeño

        return new int[]{dato, i};
    }

 /*
     == ELIMINA LA FILA(DISPONIBILIDAD)
     */
 public void EliminacionDeFilas(int indiceDisp) {
        DefaultTableModel tableModel = (DefaultTableModel) TablaProceso.getModel();
        tableModel.removeRow(indiceDisp);
    }

 /*
     == ELIMINA LA COLUMNA(DEMANDA)
     */
   public void EliminacionDeColumnas(int indiceDeman) {
        DefaultTableModel tableModel = (DefaultTableModel) TablaProceso.getModel();

        TablaProceso.removeColumn(TablaProceso.getColumnModel().getColumn(indiceDeman));
        TablaProceso.setModel(tableModel);
    }

 /*
     == COPIA LOS DATOS DE LA TABLA ORIGINAL A LA TABLA PROCESO
     */
    public void Jtables(int[][] matriz, JTable tabla) {
        DefaultTableModel tableModel = (DefaultTableModel) TablaProceso.getModel();

        for (int i = 0; i < Integer.parseInt(txtFilas.getText()); i++) {
            tableModel.addRow(new Object[]{});
        }
        for (int i = 0; i < Integer.parseInt(txtColumnas.getText()); i++) {
            if (i == Integer.parseInt(txtColumnas.getText()) - 1) {
                tableModel.addColumn("Disponibilidad");
            } else {
                tableModel.addColumn("Dato " + (i + 1));
            }
        }
        for (int i = 0; i < tabla.getRowCount(); i++) {
            for (int x = 0; x < tabla.getColumnCount(); x++) {
                TablaProceso.setValueAt(matriz[i][x], i, x);
            }
        }
    }

    /*
     == ENVIA LOS RESULTADOS DE LOS PROCEDIMIENTOS Y EL RESULTADO DE LAS MUTIPLICACIONES
    A LA VENTANARESULTADOS.
     */
    public void EnvioDeDatos() {
        DefaultListModel<String> model = new DefaultListModel<>();
        int total = 0;
        for (int i = 0; i < ListProcesos.size(); i++) {
            model.addElement(ListProcesos.get(i));
            total = total + ListMultiplicaciones.get(i);
        }
        VentanaResultados.ListaDatos.setModel(model);
        VentanaResultados.TextoCostoTotal.setText("Costo Total: " + total);
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Ocultar Botones de Guardar.
        BtnAbrir.setVisible(false);
        BtnGuardar.setVisible(false);
        BtnCancelar.setVisible(false);
        BtnResultados.setVisible(false);
        BtnReiniciarProcesos.setVisible(false);

        //Dehabilitar botones.
        BtnVer.setEnabled(false);
        BtnOpciones.setEnabled(false);
        BtnProceso.setEnabled(false);

        TxtMensajes.setText("Procedimiento");
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            DefaultTableModel tableModel = new DefaultTableModel();

            for (int i = 0; i < Integer.parseInt(txtFilas.getText()); i++) {
                tableModel.addRow(new Object[]{});
            }

            for (int i = 0; i < Integer.parseInt(txtColumnas.getText()); i++) {
                if (i == Integer.parseInt(txtColumnas.getText()) - 1) {
                    tableModel.addColumn("Disponibilidad");
                } else {
                    tableModel.addColumn("Dato " + (i + 1));
                }
            }

            jTable1.setModel(tableModel);

            BtnVer.setEnabled(true);
            BtnOpciones.setEnabled(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Campos vacios");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void BtnVerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnVerMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_BtnVerMouseClicked

    private void BtnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVerActionPerformed
        // TODO add your handling code here:
        try {

            int row = jTable1.getRowCount(); //numero de filas
            int col = jTable1.getColumnCount(); //numeros de columnas
            int[][] DatosMatriz = new int[row][col]; //crea una matriz dimensional

            GuardarDatosEnMatriz(DatosMatriz, jTable1); //Los guarda en un la matriz
            Jtables(DatosMatriz, jTable1);

            BtnProceso.setEnabled(true); //Activar boton
            //Desabilitacion de elementos.
            jButton1.setEnabled(false);
            BtnVer.setEnabled(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Llene todos Los campos para resolver");
        }
    }//GEN-LAST:event_BtnVerActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        // TODO add your handling code here:
        try {
            int row = jTable1.getRowCount(); //numero de filas
            int col = jTable1.getColumnCount(); //numeros de columnas
            int[][] DatosMatriz = new int[row][col]; //crea una matriz dimensional

            GuardarDatosEnMatriz(DatosMatriz, jTable1); //Los guarda en un la matriz
            GuardarDatosTxt(DatosMatriz); //los guarda en un txt desde escritorio

            BtnAbrir.setVisible(false);
            BtnGuardar.setVisible(false);
            BtnCancelar.setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Llene todos los campos para guardar");
        }
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code her
        //Mostrar Botones.

    }//GEN-LAST:event_jTable1MouseClicked

    private void BtnOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnOpcionesActionPerformed
        // TODO add your handling code here:
        BtnAbrir.setVisible(true);
        BtnGuardar.setVisible(true);
        BtnCancelar.setVisible(true);
    }//GEN-LAST:event_BtnOpcionesActionPerformed

    private void BtnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAbrirActionPerformed
        // TODO add your handling code here:
        String[] parts = new String[jTable1.getRowCount() * jTable1.getColumnCount()];
        //Abre el archivo y pasa los datos a un arreglo.
        parts = AbrirArchivo();
        //Llena la tabla a partir de los datos del arreglo.
        LlenarTabla(parts);

        BtnAbrir.setVisible(false);
        BtnGuardar.setVisible(false);
        BtnCancelar.setVisible(false);
    }//GEN-LAST:event_BtnAbrirActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        // TODO add your handling code here:
        BtnAbrir.setVisible(false);
        BtnGuardar.setVisible(false);
        BtnCancelar.setVisible(false);

    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void BtnProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnProcesoActionPerformed
        // TODO add your handling code here:
        try {
            int[] dispMulta = MultaDisponibilidad(TablaProceso);
            int[] demanMulta = MultaDemanda(TablaProceso);

            Comparacion(demanMulta, dispMulta, TablaProceso);
        } catch (Exception e) {
            BtnResultados.setVisible(true);
            BtnReiniciarProcesos.setVisible(true);
            BtnProceso.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Proceso Finalizado");
        }
    }//GEN-LAST:event_BtnProcesoActionPerformed

    private void BtnResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResultadosActionPerformed
        // TODO add your handling code here:
        EnvioDeDatos();
        Ventana2.setVisible(true);
    }//GEN-LAST:event_BtnResultadosActionPerformed

    private void BtnReiniciarProcesosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReiniciarProcesosActionPerformed
        // TODO add your handling code here:

        DefaultTableModel ModelPrincipal = (DefaultTableModel) jTable1.getModel();
        DefaultTableModel ModelCopia = (DefaultTableModel) TablaProceso.getModel();

        //Limpia toda la tabla Original
        ModelPrincipal.setColumnCount(0);
        ModelPrincipal.setRowCount(0);

        //Limpia toda la tabla copia.
        ModelCopia.setColumnCount(0);
        ModelCopia.setRowCount(0);

        //ocultar botones
        BtnResultados.setVisible(false);
        BtnReiniciarProcesos.setVisible(false);

        //activar botones.
        jButton1.setEnabled(true);
        BtnVer.setEnabled(true);

        //Elimina los datos de los arraylist
        ListProcesos.clear();
        ListMultiplicaciones.clear();

        //Casillas en blanco
        txtColumnas.setText("");
        txtFilas.setText("");

        TxtMensajes.setText("Procedimientos");
    }//GEN-LAST:event_BtnReiniciarProcesosActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuVoguel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAbrir;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnOpciones;
    private javax.swing.JButton BtnProceso;
    private javax.swing.JButton BtnReiniciarProcesos;
    private javax.swing.JButton BtnResultados;
    private javax.swing.JButton BtnVer;
    private javax.swing.JTable TablaProceso;
    private javax.swing.JLabel TxtMensajes;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtColumnas;
    private javax.swing.JTextField txtFilas;
    // End of variables declaration//GEN-END:variables
}
