package com.example.demo.Model;
import java.io.Serializable;

import javax.persistence.*;

@MappedSuperclass
@Access(AccessType.FIELD)
public class ParentEntity implements Serializable{

	private static final long serialVersionUID = 5624803873870747886L;
		@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name = "id", unique = true, nullable = false)
	    private Long id;


}
