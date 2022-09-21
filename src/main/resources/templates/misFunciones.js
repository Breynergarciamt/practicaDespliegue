function consultarProductos(){
    $.ajax({
        url: "https://ga53a53f5a667ba-cr7ccf2ox2y6899f.adb.us-ashburn-1.oraclecloudapps.com/ords/admin/productos/productos",
        type:"GET",
        datatype:"JSON",
        success:function(respuesta){
            console.log(respuesta);
        }
    });
}
