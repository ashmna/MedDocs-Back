package org.proffart.meddocs.model.user;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * team ProffArt
 * author Ashot Mnatsakanyan
 * date 1/15/16
 * time 4:54 PM
 */
@Entity
@DiscriminatorValue("SECRETARY")
public class Secretary extends User {
}
