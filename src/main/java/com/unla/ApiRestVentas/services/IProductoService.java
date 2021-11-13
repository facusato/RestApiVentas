package com.unla.ApiRestVentas.services;


import java.util.List;

import com.unla.ApiRestVentas.entities.Producto;
import com.unla.ApiRestVentas.entities.Vendedor;

public interface IProductoService {
	
	
	    public List<Producto> getAll();
	    
	    public List<Producto> findByVendedor(Vendedor vendedor);
		
		public Producto findByIdProducto(long idProducto);
		
		public Producto insert(Producto producto);
		
		public Producto update(Producto producto);
		
		public boolean remove(long idProducto);
		
		public Producto updateStock(Long id, int stock);

}
