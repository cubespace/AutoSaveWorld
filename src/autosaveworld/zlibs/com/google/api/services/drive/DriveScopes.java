/*
 * Copyright 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2016-10-17 16:43:55 UTC)
 * on 2016-11-17 at 13:55:42 UTC 
 * Modify at your own risk.
 */

package autosaveworld.zlibs.com.google.api.services.drive;

/**
 * Available OAuth 2.0 scopes for use with the Drive API.
 *
 * @since 1.4
 */
public class DriveScopes {

  /** View and manage the files in your Google Drive. */
  public static final String DRIVE = "https://www.googleapis.com/auth/drive";

  /** View and manage its own configuration data in your Google Drive. */
  public static final String DRIVE_APPDATA = "https://www.googleapis.com/auth/drive.appdata";

  /** View your Google Drive apps. */
  public static final String DRIVE_APPS_READONLY = "https://www.googleapis.com/auth/drive.apps.readonly";

  /** View and manage Google Drive files and folders that you have opened or created with this app. */
  public static final String DRIVE_FILE = "https://www.googleapis.com/auth/drive.file";

  /** View and manage metadata of files in your Google Drive. */
  public static final String DRIVE_METADATA = "https://www.googleapis.com/auth/drive.metadata";

  /** View metadata for files in your Google Drive. */
  public static final String DRIVE_METADATA_READONLY = "https://www.googleapis.com/auth/drive.metadata.readonly";

  /** View the photos, videos and albums in your Google Photos. */
  public static final String DRIVE_PHOTOS_READONLY = "https://www.googleapis.com/auth/drive.photos.readonly";

  /** View the files in your Google Drive. */
  public static final String DRIVE_READONLY = "https://www.googleapis.com/auth/drive.readonly";

  /** Modify your Google Apps Script scripts' behavior. */
  public static final String DRIVE_SCRIPTS = "https://www.googleapis.com/auth/drive.scripts";

  /**
   * Returns an unmodifiable set that contains all scopes declared by this class.
   *
   * @since 1.16
   */
  public static java.util.Set<String> all() {
    java.util.Set<String> set = new java.util.HashSet<String>();
    set.add(DRIVE);
    set.add(DRIVE_APPDATA);
    set.add(DRIVE_APPS_READONLY);
    set.add(DRIVE_FILE);
    set.add(DRIVE_METADATA);
    set.add(DRIVE_METADATA_READONLY);
    set.add(DRIVE_PHOTOS_READONLY);
    set.add(DRIVE_READONLY);
    set.add(DRIVE_SCRIPTS);
    return java.util.Collections.unmodifiableSet(set);
  }

  private DriveScopes() {
  }
}
