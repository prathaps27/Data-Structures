#!/bin/bash
# push.sh — quick push helper for prathaps27 (college/contest) repos
# Usage: ./push.sh "your commit message"

set -e

# --- Config: make sure this repo uses the prathaps27 identity ---
git config user.name "prathaps27"
git config user.email "prathaps2478@gmail.com"

# --- Commit message (default if none given) ---
MSG="${1:-update}"

echo "==> Staging all changes..."
git add -A

echo "==> Committing..."
git commit -m "$MSG" || echo "Nothing new to commit."

echo "==> Pushing to origin..."
git push origin HEAD

echo "✅ Done! Pushed with message: $MSG"
