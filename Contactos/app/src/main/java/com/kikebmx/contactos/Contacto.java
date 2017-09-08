package com.kikebmx.contactos;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by quiqu on 05/09/2017.
 */
public class Contacto implements Serializable {

    private static final long serialVersionUID=1L;

    private String usuario;
    private String email;
    private String twitter;
    private String telefono;
    private String fechaNac;

    public Contacto(String usu,String ema,String twi,String tel,String fecn)
    {
        usuario=usu;
        email=ema;
        twitter=twi;
        telefono=tel;
        fechaNac=fecn;
    }

    public void setUsuario (String usuario)
    {
        this.usuario=usuario;
    }

    public String getUsuario ()
    {
        return this.usuario;
    }

    public void setEmail (String email)
    {
        this.email=email;
    }

    public String getEmail ()
    {
        return this.email;
    }

    public void setTwitter (String twitter)
    {
        this.twitter=twitter;
    }

    public String getTwitter ()
    {
        return this.twitter;
    }

    public void setTelefono (String telefono)
    {
        this.telefono=telefono;
    }

    public String getTelefono ()
    {
        return this.telefono;
    }

    public void setFechaNac (String fechaNac)
    {
        this.fechaNac=fechaNac;
    }

    public String getFechaNac ()
    {
        return this.fechaNac;
    }

}