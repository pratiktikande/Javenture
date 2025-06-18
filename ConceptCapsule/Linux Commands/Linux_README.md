
# Linux Commands Cheat Sheet

This README provides a comprehensive overview of essential Linux commands, categorized from basic to advanced usage.

## 📁 Basic File and Directory Commands

```bash
pwd                 # Show current directory
ls                  # List files in directory
ls -l               # List with details
cd [dir]            # Change directory
cd ..               # Go up one directory
mkdir [dir]         # Create directory
rmdir [dir]         # Remove empty directory
rm -r [dir]         # Remove directory and contents
touch [file]        # Create empty file
rm [file]           # Remove file
cp [src] [dst]      # Copy file
mv [src] [dst]      # Move or rename file
cat [file]          # View file contents
head [file]         # View first 10 lines
tail [file]         # View last 10 lines
clear               # Clear terminal screen
```

---

## 🔍 File Viewing & Searching

```bash
less [file]         # Scroll through file
more [file]         # Similar to less
grep [str] [file]   # Search for string
find [dir] -name [file]   # Find files
locate [file]       # Search with database
which [command]     # Show command location
file [file]         # Identify file type
```

---

## 🧰 File Permissions

```bash
chmod +x [file]         # Make file executable
chmod 755 [file/dir]    # Set specific permissions
chown [user] [file]     # Change file owner
chgrp [group] [file]    # Change group
ls -l                   # View permissions
```

---

## 📦 Package Management

### Debian/Ubuntu (APT)

```bash
sudo apt update
sudo apt upgrade
sudo apt install [pkg]
sudo apt remove [pkg]
sudo apt autoremove
```

### RedHat/CentOS (YUM/DNF)

```bash
sudo yum install [pkg]
sudo yum update
sudo yum remove [pkg]

sudo dnf install [pkg]
sudo dnf update
sudo dnf remove [pkg]
```

---

## ⚙️ System Info & Monitoring

```bash
uname -a              # System info
top                   # Real-time processes
htop                  # Better top (if installed)
ps aux                # All processes
df -h                 # Disk usage
du -sh [dir]          # Directory size
free -h               # Memory usage
uptime                # System uptime
whoami                # Current user
id                    # User and group info
```

---

## 🧑‍💻 User Management

```bash
adduser [user]
passwd [user]
deluser [user]
usermod -aG [group] [user]
groups [user]
who                  # Users logged in
w                    # Show who is logged in and what they are doing
```

---

## 🔧 Networking

```bash
ip a                 # Show IP addresses
ifconfig             # Show network config (deprecated)
ping [host]          # Test connection
traceroute [host]    # Trace route
netstat -tuln        # Show open ports
ss -tuln             # Modern netstat
curl [url]           # Fetch data from URL
wget [url]           # Download file
```

---

## 📜 Text Processing

```bash
cat                  # Concatenate/display files
cut -d':' -f1 /etc/passwd    # Cut fields
awk '{print $1}' [file]      # Print fields
sed 's/old/new/g' [file]     # Replace text
sort [file]          # Sort file
uniq [file]          # Remove duplicates
wc -l [file]         # Count lines
```

---

## 🔄 Compression & Archiving

```bash
tar -cvf file.tar dir/       # Create tar
tar -xvf file.tar            # Extract tar
tar -czvf file.tar.gz dir/   # Create gzipped tar
tar -xzvf file.tar.gz        # Extract gzipped tar
zip [file.zip] [file]        # Create zip
unzip [file.zip]             # Extract zip
```

---

## 🛠️ Disk Management

```bash
mount [device] [dir]         # Mount disk
umount [dir]                 # Unmount disk
fdisk -l                     # List disks
lsblk                        # Show block devices
df -h                        # Show disk usage
```

---

## 💡 Miscellaneous

```bash
history                      # Show command history
alias ll='ls -la'            # Create alias
date                         # Show date/time
cal                          # Show calendar
man [command]                # Manual page
```

---

## 💥 Advanced & Scripting

```bash
crontab -e                   # Edit scheduled jobs
bash script.sh               # Run script
for i in *; do echo $i; done # Simple loop
ssh user@host                # SSH login
scp file user@host:/path     # Secure copy
rsync -av file/ dir/         # Sync files
```

---

---

Happy Hacking! 🐧
