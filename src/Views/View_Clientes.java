/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

/**
 *
 * @author Mike
 */
public class View_Clientes extends javax.swing.JPanel {

    /**
     * Creates new form View_Clientes
     */
    public View_Clientes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtf_telefono = new javax.swing.JTextField();
        jb_nuevo = new javax.swing.JButton();
        jtf_email = new javax.swing.JTextField();
        jb_borrar = new javax.swing.JButton();
        jb_siguiente = new javax.swing.JButton();
        jl_id_cliente = new javax.swing.JLabel();
        jtf_direccion = new javax.swing.JTextField();
        jb_editar = new javax.swing.JButton();
        jb_primero = new javax.swing.JButton();
        jtf_nombre = new javax.swing.JTextField();
        jl_descripcion = new javax.swing.JLabel();
        jb_anterior = new javax.swing.JButton();
        jb_guardar = new javax.swing.JButton();
        jl_telefono = new javax.swing.JLabel();
        jb_ultimo = new javax.swing.JButton();
        jtf_id_cliente = new javax.swing.JTextField();
        jl_duracion = new javax.swing.JLabel();
        jl_nombre = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 173, 255));

        jtf_telefono.setBackground(new java.awt.Color(51, 173, 255));
        jtf_telefono.setFont(new java.awt.Font("DejaVu Sans Mono", 0, 18)); // NOI18N
        jtf_telefono.setForeground(new java.awt.Color(255, 255, 255));
        jtf_telefono.setPreferredSize(new java.awt.Dimension(120, 27));

        jb_nuevo.setBackground(new java.awt.Color(51, 173, 255));
        jb_nuevo.setFont(new java.awt.Font("DejaVu Sans Mono", 0, 18)); // NOI18N
        jb_nuevo.setForeground(new java.awt.Color(255, 255, 255));
        jb_nuevo.setText("Nuevo");

        jtf_email.setBackground(new java.awt.Color(51, 173, 255));
        jtf_email.setFont(new java.awt.Font("DejaVu Sans Mono", 0, 18)); // NOI18N
        jtf_email.setForeground(new java.awt.Color(255, 255, 255));
        jtf_email.setPreferredSize(new java.awt.Dimension(120, 27));

        jb_borrar.setBackground(new java.awt.Color(51, 173, 255));
        jb_borrar.setFont(new java.awt.Font("DejaVu Sans Mono", 0, 18)); // NOI18N
        jb_borrar.setForeground(new java.awt.Color(255, 255, 255));
        jb_borrar.setText("Borrar");

        jb_siguiente.setBackground(new java.awt.Color(51, 173, 255));
        jb_siguiente.setFont(new java.awt.Font("DejaVu Sans Mono", 0, 18)); // NOI18N
        jb_siguiente.setForeground(new java.awt.Color(255, 255, 255));
        jb_siguiente.setText(">>");
        jb_siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_siguienteActionPerformed(evt);
            }
        });

        jl_id_cliente.setFont(new java.awt.Font("DejaVu Sans Mono", 0, 18)); // NOI18N
        jl_id_cliente.setForeground(new java.awt.Color(255, 255, 255));
        jl_id_cliente.setText("ID:");

        jtf_direccion.setBackground(new java.awt.Color(51, 173, 255));
        jtf_direccion.setFont(new java.awt.Font("DejaVu Sans Mono", 0, 18)); // NOI18N
        jtf_direccion.setForeground(new java.awt.Color(255, 255, 255));
        jtf_direccion.setPreferredSize(new java.awt.Dimension(120, 27));

        jb_editar.setBackground(new java.awt.Color(51, 173, 255));
        jb_editar.setFont(new java.awt.Font("DejaVu Sans Mono", 0, 18)); // NOI18N
        jb_editar.setForeground(new java.awt.Color(255, 255, 255));
        jb_editar.setText("Editar");

        jb_primero.setBackground(new java.awt.Color(51, 173, 255));
        jb_primero.setFont(new java.awt.Font("DejaVu Sans Mono", 0, 18)); // NOI18N
        jb_primero.setForeground(new java.awt.Color(255, 255, 255));
        jb_primero.setText("|<");

        jtf_nombre.setBackground(new java.awt.Color(51, 173, 255));
        jtf_nombre.setFont(new java.awt.Font("DejaVu Sans Mono", 0, 18)); // NOI18N
        jtf_nombre.setForeground(new java.awt.Color(255, 255, 255));
        jtf_nombre.setPreferredSize(new java.awt.Dimension(120, 27));

        jl_descripcion.setFont(new java.awt.Font("DejaVu Sans Mono", 0, 18)); // NOI18N
        jl_descripcion.setForeground(new java.awt.Color(255, 255, 255));
        jl_descripcion.setText("Dirección:");

        jb_anterior.setBackground(new java.awt.Color(51, 173, 255));
        jb_anterior.setFont(new java.awt.Font("DejaVu Sans Mono", 0, 18)); // NOI18N
        jb_anterior.setForeground(new java.awt.Color(255, 255, 255));
        jb_anterior.setText("<<");

        jb_guardar.setBackground(new java.awt.Color(51, 173, 255));
        jb_guardar.setFont(new java.awt.Font("DejaVu Sans Mono", 0, 18)); // NOI18N
        jb_guardar.setForeground(new java.awt.Color(255, 255, 255));
        jb_guardar.setText("Guardar");

        jl_telefono.setFont(new java.awt.Font("DejaVu Sans Mono", 0, 18)); // NOI18N
        jl_telefono.setForeground(new java.awt.Color(255, 255, 255));
        jl_telefono.setText("Telefono:");

        jb_ultimo.setBackground(new java.awt.Color(51, 173, 255));
        jb_ultimo.setFont(new java.awt.Font("DejaVu Sans Mono", 0, 18)); // NOI18N
        jb_ultimo.setForeground(new java.awt.Color(255, 255, 255));
        jb_ultimo.setText(">|");

        jtf_id_cliente.setBackground(new java.awt.Color(51, 173, 255));
        jtf_id_cliente.setFont(new java.awt.Font("DejaVu Sans Mono", 0, 18)); // NOI18N
        jtf_id_cliente.setForeground(new java.awt.Color(255, 255, 255));
        jtf_id_cliente.setPreferredSize(new java.awt.Dimension(120, 27));

        jl_duracion.setFont(new java.awt.Font("DejaVu Sans Mono", 0, 18)); // NOI18N
        jl_duracion.setForeground(new java.awt.Color(255, 255, 255));
        jl_duracion.setText("Email:");

        jl_nombre.setFont(new java.awt.Font("DejaVu Sans Mono", 0, 18)); // NOI18N
        jl_nombre.setForeground(new java.awt.Color(255, 255, 255));
        jl_nombre.setText("Nombre:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jl_nombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jl_duracion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jl_telefono)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jl_id_cliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtf_id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jb_nuevo)
                                    .addComponent(jb_borrar))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jb_guardar)
                                    .addComponent(jb_editar))
                                .addGap(25, 25, 25))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jb_primero)
                                .addGap(18, 18, 18)
                                .addComponent(jb_anterior)
                                .addGap(18, 18, 18)
                                .addComponent(jb_siguiente)
                                .addGap(18, 18, 18)
                                .addComponent(jb_ultimo)
                                .addGap(24, 24, 24))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jl_descripcion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jb_anterior)
                                .addComponent(jb_siguiente)
                                .addComponent(jb_ultimo)
                                .addComponent(jb_primero))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jl_id_cliente)
                                .addComponent(jtf_id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_nombre)
                            .addComponent(jtf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_telefono)
                            .addComponent(jtf_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_duracion)
                            .addComponent(jtf_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_descripcion)
                            .addComponent(jtf_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jb_nuevo)
                            .addComponent(jb_editar))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jb_borrar)
                            .addComponent(jb_guardar))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jb_siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_siguienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_siguienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jb_anterior;
    public javax.swing.JButton jb_borrar;
    public javax.swing.JButton jb_editar;
    public javax.swing.JButton jb_guardar;
    public javax.swing.JButton jb_nuevo;
    public javax.swing.JButton jb_primero;
    public javax.swing.JButton jb_siguiente;
    public javax.swing.JButton jb_ultimo;
    public javax.swing.JLabel jl_descripcion;
    public javax.swing.JLabel jl_duracion;
    public javax.swing.JLabel jl_id_cliente;
    public javax.swing.JLabel jl_nombre;
    public javax.swing.JLabel jl_telefono;
    public javax.swing.JTextField jtf_direccion;
    public javax.swing.JTextField jtf_email;
    public javax.swing.JTextField jtf_id_cliente;
    public javax.swing.JTextField jtf_nombre;
    public javax.swing.JTextField jtf_telefono;
    // End of variables declaration//GEN-END:variables
}