package com.example.myapplication.data.repositorio

import com.example.myapplication.data.comunes.FirestoreConstante
import com.example.myapplication.data.comunes.FirestoreInstance
import com.example.myapplication.data.models.ProductosModel

class ProductosRepository{
    suspend fun listar(dato: String): List <ProductosModel>{
        return FirestoreInstance.get().collection(FirestoreConstante.COLECCION_PRODUCTO)
            .orderBy("descripcion").startedAt(dato).endAt(dato + '\uf8ff')
            .get().await().toObjects(ProductosModel::class.java)
    }

    /*
    private suspend fun registrar(model: ProductosModel): Boolean{
        val documento = FirestoreInstance.get().collection(FirestoreConstante.COLECCION_PRODUCTO).document()
        model.id = documento.id
        documento.set(model).await()
        //println("Se ha realizado el registro exitosamente")
        return true
    }
    */
}