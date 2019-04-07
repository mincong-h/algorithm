#!/bin/bash
#
#    This script creates a new markdown post in /leetcode folder. The
#    naming convention is: ${id}.${title}.md
#
#    Usage:
#
#        ./newpost.sh 1 https://leetcode.com/problems/two-sum/ Two Sum
#
if [[ $# -lt 3 ]]
then
    echo 'usage: newpost.sh 1 https://leetcode.com/problems/two-sum/ Two Sum'
    exit 1
fi

id="$1"
url="$2"
label="${*:3}"
name=$(echo "$url" | sed -E 's/.*problems\/(.*)\//\1/')

longid="0000${id}"
projhome=$(cd "$(dirname "$0")" || exit; pwd)
filename="${longid: -4}.${name}.md"
filepath="${projhome}/leetcode/${filename}"

if [[ -f "$filepath" ]]
then
    echo "$filepath already exists."
    exit 1
fi

cat << EOF >> "$filepath"
# ${id} ${label}

<${url}>, Level

## Description

## Idea

> How to solve the problem? Which strategy? Time estimation?
> Corner cases?

## Test Cases

## Solution

\`\`\`java
// TODO
\`\`\`

Runtime: ? ms (faster than ?%), Memory: ? MB (better than ?%)
EOF

echo "Post created: $filepath"
