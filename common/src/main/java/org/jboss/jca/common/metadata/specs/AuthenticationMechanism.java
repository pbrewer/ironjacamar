/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2008, Red Hat Middleware LLC, and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.jca.common.metadata.specs;

import java.util.Collections;
import java.util.List;

/**
 * @author <a href="mailto:stefano.maestri@jboss.org">Stefano Maestri</a>
 *
 */
public class AuthenticationMechanism implements IdDecoratedMetadata
{
   /**
    */
   private static final long serialVersionUID = -1448136517857827148L;

   private final List<LocalizedXsdString> description;

   private final XsdString authenticationMechanismType;

   private final CredentialInterfaceEnum credentialInterface;

   private final String id;

   /**
    * @param description description attribute in xml
    * @param authenticationMechanismType specifies type of an authentication mechanism.
            The example values are:

            <authentication-mechanism-type>BasicPassword
            </authentication-mechanism-type>

            <authentication-mechanism-type>Kerbv5
            </authentication-mechanism-type>

            Any additional security mechanisms are outside the
            scope of the Connector architecture specification.
    * @param credentialInterface enumeration representing credentialInterface.
    * @param id xml ID
    */
   public AuthenticationMechanism(List<LocalizedXsdString> description, XsdString authenticationMechanismType,
         CredentialInterfaceEnum credentialInterface, String id)
   {
      super();
      this.description = description;
      this.authenticationMechanismType = authenticationMechanismType;
      this.credentialInterface = credentialInterface;
      this.id = id;
   }

   /**
    * @return description
    */
   public List<LocalizedXsdString> getDescription()
   {
      return Collections.unmodifiableList(description);
   }

   /**
    * @return authenticationMechanismType
    */
   public XsdString getAuthenticationMechanismType()
   {
      return authenticationMechanismType;
   }

   /**
    * @return credentialInterface
    */
   public CredentialInterfaceEnum getCredentialInterface()
   {
      return credentialInterface;
   }

   /**
    * {@inheritDoc}
    *
    * @see IdDecoratedMetadata#getId()
    */
   @Override
   public String getId()
   {
      return id;
   }

   /**
    * {@inheritDoc}
    *
    * @see java.lang.Object#hashCode()
    */
   @Override
   public int hashCode()
   {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((authenticationMechanismType == null) ? 0 : authenticationMechanismType.hashCode());
      result = prime * result + ((credentialInterface == null) ? 0 : credentialInterface.hashCode());
      result = prime * result + ((description == null) ? 0 : description.hashCode());
      result = prime * result + ((id == null) ? 0 : id.hashCode());
      return result;
   }

   /**
    * {@inheritDoc}
    *
    * @see java.lang.Object#equals(java.lang.Object)
    */
   @Override
   public boolean equals(Object obj)
   {
      if (this == obj)
      {
         return true;
      }
      if (obj == null)
      {
         return false;
      }
      if (!(obj instanceof AuthenticationMechanism))
      {
         return false;
      }
      AuthenticationMechanism other = (AuthenticationMechanism) obj;
      if (authenticationMechanismType == null)
      {
         if (other.authenticationMechanismType != null)
         {
            return false;
         }
      }
      else if (!authenticationMechanismType.equals(other.authenticationMechanismType))
      {
         return false;
      }
      if (credentialInterface != other.credentialInterface)
      {
         return false;
      }
      if (description == null)
      {
         if (other.description != null)
         {
            return false;
         }
      }
      else if (!description.equals(other.description))
      {
         return false;
      }
      if (id == null)
      {
         if (other.id != null)
         {
            return false;
         }
      }
      else if (!id.equals(other.id))
      {
         return false;
      }
      return true;
   }

   /**
    * {@inheritDoc}
    *
    * @see java.lang.Object#toString()
    */
   @Override
   public String toString()
   {
      return "AuthenticationMechanism [description=" + description + ", authenticationMechanismType="
            + authenticationMechanismType + ", credentialInterface=" + credentialInterface + ", id=" + id + "]";
   }
}
