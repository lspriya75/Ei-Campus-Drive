# Smart Home System

## Overview
This project simulates a Smart Home System that allows users to control different smart devices such as lights, thermostats, and door locks via a central hub. Users can set schedules, automate tasks, and view the status of each device.

## Design Patterns Used
1. **Behavioral Pattern**: Observer Pattern to update all devices when a change occurs in the system.
2. **Creational Pattern**: Factory Method for creating instances of different smart devices.
3. **Structural Pattern**: Proxy Pattern to control access to the devices.

## Functional Requirements
1. Initialize the Smart Home System with different devices, each having a unique ID and type (light, thermostat, door lock).
2. Implement features to:
   - Turn devices on/off
   - Schedule devices to turn on/off at a particular time
   - Automate tasks based on triggers (e.g., turning off lights when the thermostat reaches a certain temperature)
3. Optional: Provide the ability to add or remove devices dynamically.

## Running the Simulation
1. Navigate to the `src` directory.
2. Compile the code:
