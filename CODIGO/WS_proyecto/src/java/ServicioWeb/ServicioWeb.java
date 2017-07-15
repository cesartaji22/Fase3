/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioWeb;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import iniciar_sesion.*;
import insertar.*;
import catalogo.*;
import consultas.*;
import java.util.List;
/**
 *
 * @author TAJI
 */
@WebService(serviceName = "ServicioWeb")
public class ServicioWeb {
    cuentas_saldo nocuenta_sal = new cuentas_saldo();
    retornar_saldo_planilla saldo_nomina=new retornar_saldo_planilla();
    retornar_saldo_empresa saldo_empresa = new retornar_saldo_empresa();
    cuentas_empresa cuetas_empre = new cuentas_empresa();
    retornar_id_nomina id_nomina = new retornar_id_nomina();
    insertar_nomina_trabajador nomina_trabajador = new insertar_nomina_trabajador();
    nominas no = new nominas();
    insertar_nomina nomi = new insertar_nomina();
    login log = new login();
    login_empleados log_emp = new login_empleados();
    insertar_cliente ins_clie = new insertar_cliente();
    insertar_trabajador ins_tra = new insertar_trabajador();
    tipo_operador ti_ope = new tipo_operador();
    agencias age = new agencias();
    insertar_agencia ins_age = new insertar_agencia();
    insertar_cuenta ins_cue = new insertar_cuenta();
    retornar_id_cliente re_id_cl = new retornar_id_cliente();
    retornar_saldo saldo = new retornar_saldo();
    deposito depo =  new deposito();
    retirar re = new retirar();
    cuentas_clientes cuentas = new cuentas_clientes();
    suspender_activar sus_act = new suspender_activar();
    modalidades_pago moda = new modalidades_pago();
    insertar_prestamo presta = new insertar_prestamo();
     retornar_id_trabajador trabajo = new retornar_id_trabajador();
     cambiar_trabajador chance = new cambiar_trabajador();
     gerentes ge = new gerentes();
     insertar_proveedor prove = new insertar_proveedor();
     retornar_id_proveedor id_prove= new retornar_id_proveedor();
     insertar_producto producto = new insertar_producto();
     retornar_id_cuenta cuenta = new retornar_id_cuenta();
     asociar_cuentas aso_cue = new asociar_cuentas();
     cuentas_socios cue_socio= new cuentas_socios();
     insertar_empresa empresa = new insertar_empresa();
     retornar_id_empresa id_empresa = new retornar_id_empresa();
     insertar_personal_empresa empresa_persona = new insertar_personal_empresa();
     insertar_cuenta_empresa cuenta_empresa = new insertar_cuenta_empresa();
     login_empresa log_empresa = new login_empresa();
     historial_cliente histo_cliente = new historial_cliente();
     historial_cuenta_cliente h_cliente = new historial_cuenta_cliente();
     retornar_id_cliente_cuenta id_cli_cuen =new retornar_id_cliente_cuenta();
     retornar_puntos puntos =new  retornar_puntos();
     insertar_puntos inser_puntos = new insertar_puntos();
     historial_puntos his_pun = new historial_puntos();
     historial_puntos_cliente pun_clie = new historial_puntos_cliente();
     
    
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "login")
    public String login(@WebParam(name = "usuario") String usuario, @WebParam(name = "contrase\u00f1a") String contraseña) {
        String id = log.logearse(usuario, contraseña); 
        return id;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "login_trabajador")
    public String login_trabajador(@WebParam(name = "usuario") String usuario, @WebParam(name = "contrase\u00f1a") String contraseña) {
        String id = log_emp.logearse_empleado(usuario, contraseña);
        return id;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ingresar_clientes")
    public boolean ingresar_clientes(@WebParam(name = "cui") String cui, @WebParam(name = "nombre") String nombre, @WebParam(name = "apellido") String apellido, @WebParam(name = "fecha") String fecha, @WebParam(name = "usuario") String usuario, @WebParam(name = "password") String password) {
        boolean respuesta = ins_clie.agregar(cui, nombre, apellido, fecha, usuario, password);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "agregar_trabajador")
    public boolean agregar_trabajador(@WebParam(name = "cui") String cui, @WebParam(name = "nombre") String nombre, @WebParam(name = "apellido") String apellido, @WebParam(name = "fecha") String fecha, @WebParam(name = "usuario") String usuario, @WebParam(name = "password") String password, @WebParam(name = "tipo_de_trabajador") String tipo_de_trabajador, @WebParam(name = "agencia") String agencia) {
        boolean respuesta = ins_tra.agregar_trabajador(cui, nombre, apellido, fecha, usuario, password,tipo_de_trabajador, agencia);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "mostrar_tipo_trabajador")
    public List<String> mostrar_tipo_trabajador() {
        List<String> resultado = ti_ope.tipo_empleados();
        return resultado;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "mostrar_agencias")
    public List<String> mostrar_agencias() {
        List<String> resultado = age.info_agencias();
        return resultado;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "agregar_agencias")
    public boolean agregar_agencias(@WebParam(name = "codigo") String codigo, @WebParam(name = "nombre") String nombre, @WebParam(name = "direccion") String direccion, @WebParam(name = "telefono") String telefono) {
        boolean respuesta = ins_age.agregar_agencias(codigo, nombre, direccion, telefono);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "insertar_cuenta")
    public boolean insertar_cuenta(@WebParam(name = "cliente") int cliente, @WebParam(name = "no_cuenta") String no_cuenta, @WebParam(name = "tipo") String tipo, @WebParam(name = "saldo") double saldo) {
        boolean respuesta = ins_cue.agregar_cuentas(cliente, no_cuenta, tipo, saldo);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "retornar_idcliente")
    public int retornar_idcliente(@WebParam(name = "cui") String cui) {
       int id = re_id_cl.devolver_id_cliente(cui);
        return id;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "retornal_saldo")
    public double retornal_saldo(@WebParam(name = "no_cuenta") String no_cuenta) {
        double respuesta = saldo.devolver_saldo(no_cuenta);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "depositar")
    public boolean depositar(@WebParam(name = "no_cuenta") String no_cuenta, @WebParam(name = "dinero") double dinero) {
        boolean respuesta = depo.realizar_deposito(no_cuenta, dinero);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "retiro_monetario")
    public boolean retiro_monetario(@WebParam(name = "no_cuenta") String no_cuenta, @WebParam(name = "monto") double monto) {
        boolean respuesta = re.retiro_monetario(no_cuenta, monto);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "mostrar_cuentas")
    public List<String> mostrar_cuentas(@WebParam(name = "id_cliente") int id_cliente) {
        List<String> resultado = cuentas.info_cuentas(id_cliente);
        return resultado;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "estado_cuenta")
    public boolean estado_cuenta(@WebParam(name = "no_cuenta") String no_cuenta, @WebParam(name = "estado") String estado) {
        boolean respuesta = sus_act.cambiar_estado(no_cuenta, estado);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "modalidad_pago")
    public List<String> modalidad_pago() {
            List<String> resultado =moda.info_cuoatas();
        return resultado;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "solicitar_prestamo")
    public boolean solicitar_prestamo(@WebParam(name = "id_cliente") int id_cliente, @WebParam(name = "modalidad") String modalidad, @WebParam(name = "monto") double monto) {
        boolean respuesta = presta.agregar_prestamo(id_cliente, modalidad, monto);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "retornar_id_trabajador")
    public int retornar_id_trabajador(@WebParam(name = "cui") String cui) {
        int respuesta = trabajo.devolver_id_trabajador(cui);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "cambiar_trabajo")
    public boolean cambiar_trabajo(@WebParam(name = "cui") String cui, @WebParam(name = "puesto") String puesto) {
        boolean respuesta = chance.cambiar_trabajador(cui, puesto);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "quitar_gerente_agencia")
    public boolean quitar_gerente_agencia(@WebParam(name = "cui") String cui) {
        boolean respuesta = ge.retirar_gerente(cui);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "agregar_patrocinador")
    public boolean agregar_patrocinador(@WebParam(name = "codigo") String codigo, @WebParam(name = "nombre") String nombre, @WebParam(name = "direccion") String direccion, @WebParam(name = "telefono") String telefono) {
        boolean proveedor = prove.agregar_proveedor(codigo, nombre, direccion, telefono);
        return proveedor;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "retornar_id_proveedor")
    public int retornar_id_proveedor(@WebParam(name = "codigo") String codigo) {
        int respuesta = id_prove.devolver_id_proveedor(codigo);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "agregar_producto")
    public boolean agregar_producto(@WebParam(name = "patrocinador") int patrocinador, @WebParam(name = "codigo") String codigo, @WebParam(name = "nombre") String nombre, @WebParam(name = "punto") int punto, @WebParam(name = "existencia") int existencia, @WebParam(name = "imagen") String imagen, @WebParam(name = "fecha") String fecha) {
        boolean respuesta = producto.agregar_producto(patrocinador, codigo, nombre, punto, existencia, imagen, fecha);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "retornar_id_cuenta")
    public int retornar_id_cuenta(@WebParam(name = "no_cuenta") String no_cuenta) {
        int respuesta = cuenta.devolver_id_cuenta(no_cuenta);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "asociar_cuentas")
    public boolean asociar_cuentas(@WebParam(name = "cliente") int cliente, @WebParam(name = "cuenta") int cuenta) {
        boolean respuesta = aso_cue.asociar_cuentas_terceros(cliente, cuenta);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "mostrar_cuentas_asociadas")
    public List<String> mostrar_cuentas_asociadas(@WebParam(name = "id_cliente") int id_cliente) {
        List<String> respuesta = cue_socio.info_cuentas_socio(id_cliente);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "agregar_empresa")
    public boolean agregar_empresa(@WebParam(name = "patente") String patente, @WebParam(name = "nombre") String nombre, @WebParam(name = "direccion") String direccion, @WebParam(name = "telefono") String telefono) {
        boolean respuesta = empresa.agregar_empresa(patente, nombre, direccion, telefono);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "retornar_id_empresa")
    public int retornar_id_empresa(@WebParam(name = "patente") String patente) {
        int respuesta = id_empresa.devolver_id_empresa(patente);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "agregar_personal_empresa")
    public boolean agregar_personal_empresa(@WebParam(name = "empresa") int empresa, @WebParam(name = "cliente") int cliente, @WebParam(name = "puesto") String puesto) {
        boolean respuesta = empresa_persona.agregar_personal_emprsa(empresa, cliente, puesto);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "agregar_cuenta_empresa")
    public boolean agregar_cuenta_empresa(@WebParam(name = "empresa") int empresa, @WebParam(name = "no_cuenta") String no_cuenta, @WebParam(name = "saldo") double saldo) {
        boolean respuesta = cuenta_empresa.agregar_cuentas_empresa(empresa, no_cuenta, saldo);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "login_empresa")
    public int login_empresa(@WebParam(name = "id_cliente") int id_cliente) {
        int respuesta = log_empresa.logeo_empresa(id_cliente);
        return respuesta;
    }
    
    
    
    @WebMethod(operationName = "retiro_ahorros")
    public boolean retiro_ahorros(@WebParam(name = "no_cuenta") String no_cuenta, @WebParam(name = "monto") double monto) {
        boolean respuesta = re.retiro_ahorro(no_cuenta, monto);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "historial_cliente")
    public boolean historial_cliente(@WebParam(name = "cuenta") int cuenta, @WebParam(name = "fecha") String fecha, @WebParam(name = "concepto") String concepto, @WebParam(name = "entra") double entra, @WebParam(name = "sale") double sale, @WebParam(name = "saldo") double saldo) {
        boolean respuesta = histo_cliente.agregar_historial_cliente(cuenta, fecha, concepto, entra, sale, saldo);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "historial_cuenta_cliente")
    public List<String> historial_cuenta_cliente(@WebParam(name = "id_cuenta") int id_cuenta, @WebParam(name = "fecha_incio") String fecha_incio, @WebParam(name = "fecha_fin") String fecha_fin) {
        List<String> resultado = h_cliente.logearse_empleado(id_cuenta, fecha_incio, fecha_fin);
        return resultado;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "devoler_id_cliente_cuenta")
    public int devoler_id_cliente_cuenta(@WebParam(name = "no_cuenta") String no_cuenta) {
        int respuesta = id_cli_cuen.devolver_id_cliente_por_cuenta(no_cuenta);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "retornar_puntos")
    public int retornar_puntos(@WebParam(name = "id_cliente") int id_cliente) {
        int respuesta = puntos.devolver_puntos(id_cliente);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "insertar_puntos")
    public boolean insertar_puntos(@WebParam(name = "id_cliente") int id_cliente, @WebParam(name = "puntos") int puntos) {
          boolean respuesta = inser_puntos.sumar_puntos(id_cliente, puntos);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "historial_puntos")
    public boolean historial_puntos(@WebParam(name = "id_cliente") int id_cliente, @WebParam(name = "fecha") String fecha, @WebParam(name = "concepto") String concepto, @WebParam(name = "entra") int entra, @WebParam(name = "sale") int sale, @WebParam(name = "puntos") int puntos) {
        boolean respuesta = his_pun.agregar_historial_puntos(id_cliente, fecha, concepto, entra, sale, puntos);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ver_historial_puntos")
    public List<String> ver_historial_puntos(@WebParam(name = "id_cliente") int id_cliente) {
        List<String> respuesta = pun_clie.historial_puntos(id_cliente);
        return respuesta;
       
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "nomina")
    public boolean nomina(@WebParam(name = "empresa") int empresa, @WebParam(name = "no_nomina") String no_nomina, @WebParam(name = "nombre") String nombre, @WebParam(name = "descripcion") String descripcion) {
        boolean respuesta = nomi.agregar_nomina(empresa, no_nomina, nombre, descripcion);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "informacion_nomina")
    public List<String> informacion_nomina(@WebParam(name = "id_empresa") int id_empresa) {
        List<String> respuesta = no.info_nominas(id_empresa);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "agregar_empleado_nomina")
    public boolean agregar_empleado_nomina(@WebParam(name = "id_nomina") int id_nomina, @WebParam(name = "id_cuenta") int id_cuenta, @WebParam(name = "salario") double salario) {
        boolean respuesta = nomina_trabajador.agregar_trabajador(id_nomina, id_cuenta, salario);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "retornar_id_nomina")
    public int retornar_id_nomina(@WebParam(name = "no_nomina") String no_nomina) {
        int respuesta = id_nomina.devolver_id_nomina(no_nomina);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "mostrar_cuentas_empresas")
    public List<String> mostrar_cuentas_empresas(@WebParam(name = "id_empresa") int id_empresa) {
        List<String> respuesta = cuetas_empre.info_cuentas_empresa(id_empresa);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "retiro_empresa")
    public boolean retiro_empresa(@WebParam(name = "no_cuenta") String no_cuenta, @WebParam(name = "monto") double monto) {
        boolean respuesta = re.retiro_empresa(no_cuenta, monto);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "retornar_saldo_empresa")
    public double retornar_saldo_empresa(@WebParam(name = "no_cuenta") String no_cuenta) {
        double respuesta = saldo_empresa.devolver_saldo_empresa(no_cuenta);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "retornar_saldo_nomina")
    public double retornar_saldo_nomina(@WebParam(name = "id_nomina") int id_nomina) {
        double respuesta = saldo_nomina.devolver_saldo_planilla(id_nomina);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "no_cuenta_saldo")
    public List<String> no_cuenta_saldo(@WebParam(name = "id_nomina") int id_nomina) {
        List<String> respuesta = nocuenta_sal.nocuenta_saldo(id_nomina);
        return respuesta;
    }

    
    
}
