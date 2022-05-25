package com.cg.placement.entities;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public abstract class parent {
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "college")
	protected College college;

}
