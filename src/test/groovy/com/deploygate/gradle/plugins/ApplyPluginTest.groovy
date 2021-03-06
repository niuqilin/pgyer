package com.deploygate.gradle.plugins

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import org.junit.Test
import org.quanqi.pgyer.gradle.plugins.PgyerTask

import static org.junit.Assert.assertTrue

class ApplyPluginTest {
    @Test
    public void checkTask() {
        Project target = ProjectBuilder.builder().build()
        target.apply plugin: 'deploygate'

        assertTrue(target.tasks.uploadDeployGate instanceof PgyerTask)
    }
}
