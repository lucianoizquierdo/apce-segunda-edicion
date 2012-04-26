/*Metodo que llama al jsp de altas de materia prima*/
function altaMateriaPrima(path)
{
	
	var alta = path + "/forms/altaMateriasPrimas.do";
	//alert(alta);
	document.location.href = alta;      
}