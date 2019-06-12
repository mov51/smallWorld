# smallWorld  

Shrinking worlds for those with a need!
  
This is a program built to split up large worlds into smaller pieces for external download. Currently in development for the CapeCraft server for after the reset.<br/>
Current coders are heek89 and mov51, two very inecxpernced java developers for what should be a very simple project.
<br/><br/>
Standalone we plan to have it be a very simple program. Intended to be used by placing it within the world folder you want to copy and opening via command line with the parameters required to get the smaller world. Use cases would be geting quick copies of a section of a live world, dispersing a world download after the reset of a large world, backing up a small part of a world, and exporting sections of a world for use in anbother world.<br/>

<br/><br/>
# Planned features  

- rectangle region export "x1 ,z1, x2, z2"
- radius region export "x, z" radius"
- radius around a player region export "PlayerUUID, radius"
- predefined region export "regionName"
- player data exporting "UUID, UUID, ..."
  - Would need UUIDs of all playeRs
  - adds player data files to file export
- world gen options when exporting
  - void
  - seed based world gen
  - random world gen (no seed)
- download multiple regions at once
