//package com.boot.admin;
//
//import org.lightadmin.api.config.AdministrationConfiguration;
//import org.lightadmin.api.config.builder.EntityMetadataConfigurationUnitBuilder;
//import org.lightadmin.api.config.unit.EntityMetadataConfigurationUnit;
//
//import com.boot.model.StaffDetails;
//
//public class StaffDetailsAdmin extends AdministrationConfiguration<StaffDetails> {
//
//	@Override
//	public EntityMetadataConfigurationUnit configuration(EntityMetadataConfigurationUnitBuilder configurationBuilder) {
//		return configurationBuilder
//				.nameField("firstName")
//				.nameField("lastName")
//				.nameField("email")
//				.nameField("buisnessContactNo")
//				.nameField("personalContactNo")
//				.nameField("gender")
//				.singularName("StaffDetail")
//				.pluralName("StaffDetails").build();
//	}
//
//}
