$(document).ready(function() {
    //declaramos el datatable
    var table = $('#example').DataTable( {
        "columnDefs": [
            {
                //aplica una regla de renderizado a la columna 0
                "render": function ( data, type, row ) {
                    return data +' ('+ row[3]+')';
                },
                "targets": 0,
            },
            {
                ////aplica una regla de renderizado a la columna 4
                // "render": function ( data, type, row ) {
                //     var fecha = new Date(data);
                //     return fecha.getDate()+"-"+(fecha.getMonth()+1)+"-"+fecha.getFullYear();
                // },
                // "targets": 4
            },//
            { "visible": true,  "targets": [ 3 ] }//esto vale para ocultar las columnas
        ]
    } );
  
    //aquí tienen que aplicarse las búsquedas
    table.columns().every( function () {
        var that = this;
        console.log("ul>li:eq("+that.index()+")");
        $('input, select', $("ul>li:eq("+that.index()+")")).on( 'keyup change', function () {
            if ( that.search() !== this.value ) {
                that.search(this.value).draw();
            }
        } );
      
    } );
  

    
    //cosas aparte
    //desplegar o recoger el menú de filtros
    $("h3").on("click",function(){
       $(".search-fields").toggleClass("show"); 
    });
    
    //visibilidad de las columnas
    $(".search-fields .hasVisible .glyphicon").on("click", function(e){
        e.preventDefault();
        $(this).parent().toggleClass("no");
        
         var column = table.column( $(this).parent().attr('data-column') );
 
        // Toggle the visibility
        column.visible( ! column.visible() );
    });
    
  
} );