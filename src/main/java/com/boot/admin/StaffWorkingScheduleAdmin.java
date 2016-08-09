//package com.boot.admin;
//
//import org.lightadmin.api.config.AdministrationConfiguration;
//import org.lightadmin.api.config.builder.EntityMetadataConfigurationUnitBuilder;
//import org.lightadmin.api.config.unit.EntityMetadataConfigurationUnit;
//
//import com.boot.model.StaffWorkingSchedule;
//
//public class StaffWorkingScheduleAdmin extends AdministrationConfiguration<StaffWorkingSchedule> {
//	
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
