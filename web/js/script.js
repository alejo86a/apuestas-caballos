// $(document).ready(function() {
//     $('#submit').click(function(event) {
//         var nombreVar = $('#nombre').val();
//         var apellidoVar = $('#apellido').val();
//         var edadVar = $('#edad').val();
//         // Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
//         $.post('ActionServlet', {
//             nombre : nombreVar,
//             apellido: apellidoVar,
//             edad: edadVar
//         }, function(responseText) {
//             $('#tabla').html(responseText);
//         });
//     });
// });



var bettors = [
    {
        name: "alejo",
        amount: "10000"
    },{
        name: "andrei",
        amount: "10000"
    },{
        name: "santi",
        amount: "10000"
    },{
        name: "maritza",
        amount: "10000"
    }
]

var  horses = [
    {
        id: 1,
        name: "caballito"
    },{
        id: 2,
        name: "caballote"
    },{
        id: 1,
        name: "caballo"
    },{
        id: 1,
        name: "pedro"
    }
]

function pedirApostadores() {
    $(document).ready(function() {
        for (var i = 0; i < bettors.length; i++) {
            $.post('BettorServlet', {
                name: bettors[i].name,
                amount: bettors[i].amount
            }, function(responseText) {
                console.log(responseText);
                $('#tabla').html(responseText);
            });
        }
    });
}

pedirApostadores();
