plugins {
    id("java")
}

subprojects {
    apply<JavaPlugin>()

//    group = "org.example"

    repositories {
        mavenLocal()
        mavenCentral()
//        maven("https://repo.codemc.io/repository/nms/")
		//maven("https://libraries.minecraft.net/minecraft-server")
		//maven("https://papermc.io/repo/repository/maven-public/")
    }

    java {
        sourceCompatibility = JavaVersion.VERSION_16
        targetCompatibility = JavaVersion.VERSION_16
    }
}



//plugins {
//	id 'fabric-loom' version '0.12-SNAPSHOT'
//	id 'maven-publish'
//}
//
//
//sourceCompatibility = JavaVersion.VERSION_17
//targetCompatibility = JavaVersion.VERSION_17
//
//
//archivesBaseName = "${project.archives_base_name}-${project.minecraft_version}"
//version = project.mod_version
//group = project.maven_group
//
//repositories {
//    maven { url 'https://masa.dy.fi/maven' }
//    maven { url = "https://www.cursemaven.com" }
//}
//
//dependencies {
//	//to change the versions see the gradle.properties file
//	minecraft "com.mojang:minecraft:${project.minecraft_version}"
//	mappings "net.fabricmc:yarn:${project.yarn_mappings}:v2"
//
//	modImplementation "net.fabricmc:fabric-loader:${project.loader_version}"
//	modImplementation "net.fabricmc.fabric-api:fabric-api:${project.fabric_version}"
//	modImplementation "fi.dy.masa.malilib:malilib-fabric-${project.malilib_version}"
//	modImplementation "curse.maven:litematica-${project.litematica_projectid}:${project.litematica_fileid}"
//}
//
//processResources {
//	inputs.property "version", project.version
//
//	filesMatching("fabric.mod.json") {
//		expand "version": project.version
//	}
//}
//
//tasks.withType(JavaCompile).configureEach {
//	// Minecraft 1.18 (1.18-pre2) upwards uses Java 17.
//	it.options.release = 17
//}
//
//java {
//	// Loom will automatically attach sourcesJar to a RemapSourcesJar task and to the "build" task
//	// if it is present.
//	// If you remove this line, sources will not be generated.
//	withSourcesJar()
//}
//
//jar {
//	from("LICENSE") {
//		rename { "${it}_${project.archivesBaseName}"}
//	}
//}
//
//// configure the maven publication
//publishing {
//	publications {
//		mavenJava(MavenPublication) {
//			from components.java
//		}
//	}
//
//	// See https://docs.gradle.org/current/userguide/publishing_maven.html for information on how to set up publishing.
//	repositories {
//		// Add repositories to publish to here.
//		// Notice: This block does NOT have the same function as the block in the top level.
//		// The repositories here will be used for publishing your artifact, not for
//		// retrieving dependencies.
//	}
//}
