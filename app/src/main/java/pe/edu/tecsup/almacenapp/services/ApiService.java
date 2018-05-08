package pe.edu.tecsup.almacenapp.services;

import java.util.List;

import pe.edu.tecsup.almacenapp.models.Producto;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Alumno on 8/05/2018.
 */

public interface ApiService {

    String API_BASE_URL = " https://productos-api-alexisalva.c9users.io/";

    @GET("api/v1/productos")
    Call<List<Producto>> getProductos();

}
