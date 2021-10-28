   $("#pais").change(function(){ 
        	console.log("Pais");
            let tam = $('#provincia > option').length;
        if($(this).val() != " " && $("#nacionalidad").val() != " " &&  tam < 2 ){
       $('#provincia').removeAttr("disabled");
       $('#localidad').removeAttr("disabled");
       if($(this).val() == "0" ){
       $('#provincia').append($("<option>", {
        value: "0",
        text: "Santa Fe"
        }));
    
       
        $('#localidad').append($("<option>", {
         value: "0",
         text: "Santa Fe"
         }));
    
        }


    }else if($(this).val() == " " || $("#nacionalidad").val() == " "){
            $('#provincia').attr("disabled","disabled");
            $('#localidad').attr("disabled","disabled");
        }else{
            $('#provincia').removeAttr("disabled");
            $('#localidad').removeAttr("disabled");
        }
   });


   $("#nacionalidad").change(function(){     console.log("nacionalidad");  
            let tam = $('#localidad > option').length;
        if($("#pais").val() != " " && $("#nacionalidad").val() != " " &&  tam < 2 ){ console.log("en el if");  
        $('#provincia').removeAttr("disabled");
        $('#localidad').removeAttr("disabled");
        if($(this).val() == "0" ){
            $('#provincia').append($("<option>", {
             value: "0",
             text: "Santa Fe"
             }));
         
            
             $('#localidad').append($("<option>", {
              value: "0",
              text: "Santa Fe"
              }));
         
             }}else if($("#pais").val() == " " || $(this).val() == " "){
            $('#localidad').attr("disabled","disabled"); console.log("en el else");  
            $('#provincia').attr("disabled","disabled");
        }else{
            $('#localidad').removeAttr("disabled");
            $('#provincia').removeAttr("disabled");
        }
         console.log("fin del if");  
   });

   